package io.confluent.connect.jdbc.gp.gpload;

import io.confluent.connect.jdbc.sink.JdbcSinkConfig;
import net.openhft.chronicle.queue.ChronicleQueue;
import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.queue.ExcerptTailer;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueueBuilder;
import org.apache.kafka.connect.sink.SinkRecord;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QueueManager {
    private static final Logger log = LoggerFactory.getLogger(QueueManager.class);
    private final ChronicleQueue queue;
    private final ExecutorService executorService = Executors.newCachedThreadPool();

    public QueueManager(JdbcSinkConfig config, String name) {
        this.queue = SingleChronicleQueueBuilder.single(config.queueDataDir + "" + name).build();
    }


    public ExcerptAppender getAppender() {
        return queue.acquireAppender();
    }

    public void writeMessages(String key, List<String> messages) {
        executorService.submit(() -> {
            ExcerptAppender appender = queue.acquireAppender();
            for (String message : messages) {
                appender.writeText(message);
            }
        });
    }

    public void readMessages(int batchSize, long maxWaitTime, MessageHandler handler) {
        executorService.submit(() -> {
            List<SinkRecord> records = new ArrayList<>();
            long startTime = System.currentTimeMillis();
            while (true) {
                @NotNull ExcerptTailer reader = queue.createTailer();

                if (!reader.readDocument(w -> {
                    while (w.read("record") != null) {
                        log.info("[QueueManager] - reading records from queue");
                        SinkRecord sinkRecord = w.read("record").object(SinkRecord.class);
                        records.add(sinkRecord);
                    }
                })) {
                    // no record, wait a bit
                    //  Thread.sleep(2000);
                }

                if (records.size() >= batchSize || System.currentTimeMillis() - startTime >= maxWaitTime) {
                    log.info("[QueueManager] - handling records");
                    handler.handle(records);
                    records.clear();
                    startTime = System.currentTimeMillis();
                }else {
                    log.info("[QueueManager] - waiting for more records");
                }
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    log.error("Error while waiting for more records", e);
                }
            }
        });
    }


    public interface MessageHandler {
        void handle(List<SinkRecord> records);
    }

    public void shutdown() {
        executorService.shutdown();
        queue.close();
    }

}
