//package io.confluent.connect.jdbc.gp.gpfdist;
//
//import net.openhft.chronicle.queue.ChronicleQueue;
//import net.openhft.chronicle.queue.ExcerptReader;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Map;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class MessagesConsumer {
//    private final Map<String, ChronicleQueue> queues;
//    private final ExecutorService executorService;
//    private final int batchSize;
//
//    public MessagesConsumer(Map<String, ChronicleQueue> queues, int threadPoolSize, int batchSize) {
//        this.queues = queues;
//        this.executorService = Executors.newFixedThreadPool(threadPoolSize);
//        this.batchSize = batchSize;
//    }
//
//    public void startProcessing(int numMessages) {
//        for (String key : queues.keySet()) {
//            executorService.submit(() -> processQueue(key, numMessages));
//        }
//    }
//
//    private void processQueue(String key, int numMessages) {
//        ExcerptReader reader = queues.get(key).createTailer();
//        Path outputPath = Paths.get(key + "_output.txt"); // Output file per queue
//
//        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
//            StringBuilder batch = new StringBuilder();
//
//            for (int i = 0; i < numMessages; i++) {
//                String message = reader.readText();
//                if (message == null) {
//                    break; // Stop if there are no more messages
//                }
//                batch.append(message).append(System.lineSeparator());
//
//                // Write in batches
//                if ((i + 1) % batchSize == 0) {
//                    writer.write(batch.toString());
//                    batch.setLength(0); // Clear the batch
//                }
//            }
//
//            // Write any remaining messages
//            if (batch.length() > 0) {
//                writer.write(batch.toString());
//            }
//            System.out.println("Finished writing messages from " + key + " to " + outputPath);
//        } catch (IOException e) {
//            System.err.println("Error writing to file for " + key + ": " + e.getMessage());
//        }
//    }
//
//    // Clean up resources
//    public void shutdown() {
//        executorService.shutdown();
//    }
//
//    public static void main(String[] args) {
//        // Example setup
//        MultiQueueManager queueManager = new MultiQueueManager();
//        queueManager.writeMessages("queue1", List.of("Hello from queue 1 - message 1", "Hello from queue 1 - message 2"));
//        queueManager.writeMessages("queue2", List.of("Hello from queue 2 - message 1", "Hello from queue 2 - message 2"));
//
//        // Prepare MessageFileExecutor with batch size and thread pool size
//        MessageFileExecutor executor = new MessageFileExecutor(queueManager.getQueues(), 4, 10); // 4 threads, batch size 10
//        executor.startProcessing(100); // Read up to 100 messages from each queue
//
//        // Clean up resources
//        executor.shutdown();
//        queueManager.shutdown();
//    }
//}
