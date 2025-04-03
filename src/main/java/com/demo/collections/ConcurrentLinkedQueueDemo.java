package com.demo.collections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {

    public static void main(String[] args) {
        //Performance improved than Blocking Queue
        //Lock won't be applied to block
        //Compare and swap is used here like HashMap
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        Thread producer = new Thread(() -> {
            while(true){
                queue.add("String " + System.currentTimeMillis());
            }
        });
        Thread consumer = new Thread(() -> {
            while(true){
                String message = queue.poll();
                System.out.println("Consuming: "+message);
            }
        });
        producer.start();
        consumer.start();

    }
}
