package io.confluent.connect.jdbc.sink;

import io.confluent.connect.jdbc.dialect.DatabaseDialect;
import io.confluent.connect.jdbc.dialect.DatabaseDialect.StatementBinder;
import io.confluent.connect.jdbc.gp.GpDataIngestionService;
import io.confluent.connect.jdbc.gp.gpfdist.GpfdistDataIngestionService;
import io.confluent.connect.jdbc.gp.gpload.GPLoadDataIngestionService;
import io.confluent.connect.jdbc.gp.gpload.QueueManager;
import io.confluent.connect.jdbc.gp.gpss.GPSSDataIngestionService;
import io.confluent.connect.jdbc.sink.metadata.FieldsMetadata;
import io.confluent.connect.jdbc.sink.metadata.SchemaPair;
import io.confluent.connect.jdbc.util.TableDefinition;
import net.openhft.chronicle.bytes.BytesStore;
import net.openhft.chronicle.queue.ExcerptAppender;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.sink.SinkRecord;
import org.eclipse.jetty.websocket.common.message.MessageAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GPBinder implements StatementBinder {

    private final JdbcSinkConfig.PrimaryKeyMode pkMode;
    private final SchemaPair schemaPair;
    private final FieldsMetadata fieldsMetadata;
    private final JdbcSinkConfig.InsertMode insertMode;
    private final DatabaseDialect dialect;
    private final TableDefinition tabDef;
    private final JdbcSinkConfig config;
    private QueueManager queueManager;
    private ExcerptAppender queueAppender;


    private List<SinkRecord> records;

    private GpDataIngestionService gpDataIngestor;

    private static final Logger log = LoggerFactory.getLogger(GPBinder.class);

    @Deprecated
    public GPBinder(
            DatabaseDialect dialect,
            JdbcSinkConfig.PrimaryKeyMode pkMode,
            SchemaPair schemaPair,
            FieldsMetadata fieldsMetadata,
            JdbcSinkConfig.InsertMode insertMode
    ) {
        this(
                dialect,
                pkMode,
                schemaPair,
                fieldsMetadata,
                null,
                insertMode,
                null
        );
    }

    public GPBinder(
            DatabaseDialect dialect,
            JdbcSinkConfig.PrimaryKeyMode pkMode,
            SchemaPair schemaPair,
            FieldsMetadata fieldsMetadata,
            TableDefinition tabDef,
            JdbcSinkConfig.InsertMode insertMode,
            JdbcSinkConfig config
    ) {
        this.dialect = dialect;
        this.pkMode = pkMode;
        this.schemaPair = schemaPair;
        this.fieldsMetadata = fieldsMetadata;
        this.insertMode = insertMode;
        this.tabDef = tabDef;
        this.config = config;

        if(config.dataQueueMode == JdbcSinkConfig.DataQueueMode.PERSISTENT_QUEUE){
            log.info("[QueueManager] - Using Queue to store records locally");
            this.queueManager = new QueueManager(config, tabDef.id().tableName());
            this.queueAppender = this.queueManager.getAppender();
            startQueueReader();

        } else{
            log.info("Using in-memory array to store records");
            records = new ArrayList<>();
        }


        if (config.batchInsertMode == JdbcSinkConfig.BatchInsertMode.GPLOAD) {
            log.info("Using GPLOAD to insert records");
            gpDataIngestor = new GPLoadDataIngestionService(this.config, this.dialect, this.tabDef, this.fieldsMetadata , this.schemaPair);

        } else if (config.batchInsertMode == JdbcSinkConfig.BatchInsertMode.GPSS) {
            log.info("Using GPSS to insert records");
              gpDataIngestor = new GPSSDataIngestionService(config, dialect, tabDef, this.fieldsMetadata, this.schemaPair );
        } else if (config.batchInsertMode == JdbcSinkConfig.BatchInsertMode.GPFDIST) {
            log.info("Using GPFDIST to insert records");
            gpDataIngestor =  new GpfdistDataIngestionService(config, dialect, tabDef, this.fieldsMetadata, this.schemaPair);
        } else {
            throw new IllegalArgumentException("Invalid batch insert mode " + config.batchInsertMode);

        }
    }

    private void startQueueReader() {
        this.queueManager.readMessages(this.config.queueBatchSize,this.config.queueBatchTimeout, records -> {
            try {
                log.info("[QueueManager] - Message from queue: {}", records.size());
                gpDataIngestor.ingest(records);
            }catch (Exception e){
                log.error("[QueueManager] - Error while reading messages from queue", e);
                // restart
                startQueueReader();
            }
        });
    }

    @Override
    public void bindRecord(SinkRecord record) throws SQLException {
        final Struct valueStruct = (Struct) record.value();
        final boolean isDelete = valueStruct == null;

        if (!isDelete) { // TODO pending delete case

//            Map<String, Object> row = new HashMap<>();
//            tabDef.columnNames().forEach(field -> {
//                row.put(field, valueStruct.get(field));
//            });
//            dataRows.add(row);


            if(config.dataQueueMode != JdbcSinkConfig.DataQueueMode.PERSISTENT_QUEUE){
                log.info("Adding record to in-memory array");
                records.add(record);
            }else{
                log.info("[QueueManager] - Adding record to queue");
                queueAppender.writeDocument(w -> {
                   w.write("record").object(record);
                });
            }


        }else {
            log.info("Ignoring delete record");
            if (config.printDebugLogs) {
                log.info("Ignored deleted record in gp mode {}", record);
            }
        }
    }

    public  void  flush() {


//        if(gpDataIngestor.ingest(records)){  // TODO convert ingest to return boolean
//            records.clear();
//        };

        if(config.dataQueueMode != JdbcSinkConfig.DataQueueMode.PERSISTENT_QUEUE){
            log.info("Flushing {} records", records.size());
            if (records.isEmpty()) {
                log.info("No records to flush");
                return;
            }
            gpDataIngestor.ingest(records);
            records.clear();
        }

    }

}