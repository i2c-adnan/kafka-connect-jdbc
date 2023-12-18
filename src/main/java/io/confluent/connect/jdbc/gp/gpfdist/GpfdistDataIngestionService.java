package io.confluent.connect.jdbc.gp.gpfdist;

import io.confluent.connect.jdbc.dialect.DatabaseDialect;
import io.confluent.connect.jdbc.gp.GpDataIngestionService;
import io.confluent.connect.jdbc.gp.gpfdist.framweork.GpfdistSimpleServer;
import io.confluent.connect.jdbc.gp.gpfdist.framweork.GpfdistSinkConfiguration;
import io.confluent.connect.jdbc.gp.gpfdist.framweork.support.GreenplumLoad;
import io.confluent.connect.jdbc.gp.gpfdist.framweork.support.NetworkUtils;
import io.confluent.connect.jdbc.gp.gpfdist.framweork.support.RuntimeContext;
import io.confluent.connect.jdbc.sink.JdbcSinkConfig;
import io.confluent.connect.jdbc.sink.metadata.FieldsMetadata;
import io.confluent.connect.jdbc.util.TableDefinition;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.sink.SinkRecord;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import static java.util.Collections.emptyList;

public class GpfdistDataIngestionService extends GpDataIngestionService {

    private static final Logger log = LoggerFactory.getLogger(GpfdistDataIngestionService.class);

//    private GpfdistSimpleServer gpfdistServer;
//    SparkHttpServer httpServer;
    public GpfdistDataIngestionService(JdbcSinkConfig config, DatabaseDialect dialect, TableDefinition tabDef, FieldsMetadata fieldsMetadata) {
        super(config,dialect , tabDef, fieldsMetadata);
        setupServer();
    }

    public GpfdistDataIngestionService(JdbcSinkConfig config, DatabaseDialect dialect, String tableName, FieldsMetadata fieldsMetadata) {
        super(config, dialect, tableName, fieldsMetadata);
        setupServer();
    }

    private void setupServer(){
        try {

//            httpServer = SparkHttpServer.getInstance();
//            if(!httpServer.isInitialized()){
//                httpServer.init(config);
//            }
//            Environment.initializeIfEmpty().assignErrorJournal(new Consumer<Throwable>() {
//                @Override
//                public void accept(Throwable throwable) {
//                    log.error("Error in reactor", throwable);
//                }
//            });
//            log.info("Creating gpfdist protocol listener on port=" + config.getGpfdistPort());
          //  dataBuffer = RingBufferProcessor.create(false);
//            gpfdistServer = new GpfdistServer(dataBuffer, config.getGpfdistPort(), config.gpfFlushCount, config.gpfFlushCount, config.gpfBatchTimeout, config.gpfBatchCount);
//            gpfdistServer.start();
//            log.info("gpfdist protocol listener running on port=" + gpfdistServer.getLocalPort());
        } catch (Exception e) {
            throw new RuntimeException("Error starting protocol listener", e);
        }
    }


    @Override
    public void ingest(List<SinkRecord> records) {
        try {
            final List fields = Arrays.asList(fieldsMetadata.allFields.keySet().toArray()); // optimization
            log.info("Ingesting " + records.size() + " records");

            List<List<String>> recordsList = new ArrayList<>();

            for (SinkRecord record : records){

                    log.info("Ingesting record " + record);
                  //  List data = new ArrayList(fields.size());
                List<String> data = new ArrayList<>();
                    final Struct valueStruct = (Struct) record.value();
                    for (int i = 0; i < fields.size(); i++) {
                        String value = String.valueOf(valueStruct.get(fields.get(i).toString()));
                      //  data.add(i, value);
                        if(value == null || value.equals("null") ){
                            value = "NULL";
                        }
                        data.add(value);
                       // writeData(value, config.delimiter);
                    }
                   // rows.add(data);
                    log.info("Ingested record " + record);
                    recordsList.add(data);
                   // writeData("\n", null);
                }


         log.info("Ingested " + records.size() + " records");
      //JdbcSinkConfig config, String table, String columns, List<String> matchColumns, List<String> updateColumns, String updateCondition, List<String> sqlBefore, List<String> sqlAfter
        Map<String, String> fieldsMap = new HashMap<>();
        fields.forEach(field -> {
            fieldsMap.put(field.toString(), field.toString());
        });
        log.info("Ingesting records into table " + tableName);
        log.info("Ingesting fieldmap " + fieldsMap);


        // convert it as following col1 datatype, col2 datatype, col3 datatype...
        String columnsWithDataType = createColumnNameDataTypeString(",");

        String columns = String.join(",",fieldsMetadata.allFields.keySet().toArray(new String[]{}) );


        String externalTableName = "ext_"+tableName + "_"+UUID.randomUUID().toString().replace("-","_");

        log.info("Ingesting records into external table " + externalTableName);

        GpfdistSinkConfiguration gpfdistSinkConfiguration =
                    new GpfdistSinkConfiguration(config, externalTableName, tableName, columns, columnsWithDataType, Arrays.asList(fieldsMetadata.keyFieldNames.toArray(new String[]{})), Arrays.asList(fieldsMetadata.nonKeyFieldNames.toArray(new String[]{})) ,"", emptyList(),emptyList());


        // fill databuffer
//        for (List<String> record : recordsList){
//            for (int j = 0; j < record.size(); j++) {
//                String data = record.get(j);
//                if( j ==record.size()-1){
//                    writeData(data, "\n");
//                  continue;
//                }
//                writeData(data, config.delimiter);
//
//            }
//            break;
//
//        }

//        httpServer.addData("/data",recordsList.get(0));

//if(gpfdistServer == null) {
    GpfdistSimpleServer.getInstance().setRecords(recordsList);

//}
         GreenplumLoad gpload = gpfdistSinkConfiguration.greenplumLoad(dialect);
         gpload.load(getServerContext());
//            gpload.load();



        } catch (Exception e) {
            log.error("Error running GPload", e);
        }
    }


    public RuntimeContext getServerContext()
    {
        final RuntimeContext context = new RuntimeContext(
                NetworkUtils.getGPFDistUri(config.getGpfdistHost(), config.getGpfdistPort()));
        return context;

    }
//    private void writeData(String data, String delimiter) {
//        try {
//            if (delimiter != null) {
//                dataBuffer.onNext(Buffer.wrap(data + delimiter));
//                log.info("Writing data " + data + delimiter);
//            } else {
//                dataBuffer.onNext(Buffer.wrap(data));
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    protected void stopServer() {
//
//        try {
//            dataBuffer.onComplete();
//            gpfdistServer.stop();
//        } catch (Exception e) {
//            log.warn("Error shutting down protocol listener", e);
//        }
//    }

}
