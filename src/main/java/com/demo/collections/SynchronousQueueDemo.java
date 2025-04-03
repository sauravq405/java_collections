package com.demo.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();
        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer is waiting to transfer...");
                String message = "Message to producer";
                queue.put(message);
                System.out.println("Producer has produced");
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Producer thread interrupted");
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting to receive...");
                String message = queue.take();
                System.out.println("Message received: "+message);
                System.out.println("Consumer has consumed");
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer thread interrupted");
            }
        });
        producer.start();
        consumer.start();
        //Consumer will consume only after Producer produces
    }
}
