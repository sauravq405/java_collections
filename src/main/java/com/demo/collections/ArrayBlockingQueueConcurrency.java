package com.demo.collections;

import java.util.Comparator;
import java.util.concurrent.*;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced: "+value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (Exception ignored) {
                Thread.currentThread().interrupt();
                System.out.println("Producer Thread interrupted");
            }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                int value = queue.take();
                System.out.println("Consumer consumed: "+value);
                Thread.sleep(2000);
            } catch (Exception ignored) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer Thread interrupted");
            }
        }
    }
}

public class ArrayBlockingQueueConcurrency {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue1 = new ArrayBlockingQueue<>(5);
        //A bounded(fixed-size) blocked queue backed by a circular array
        //low memory overhead
        //single lock is used for enqueue and dequeue operation
        //more thread will be problem here
        Thread producer = new Thread(new Producer(queue1));
        Thread consumer = new Thread(new Consumer(queue1));
        producer.start();
        consumer.start();
        BlockingQueue<Integer> queue2 = new LinkedBlockingQueue<>();
        //optionally bound, backed by linked list
        //uses two separate locks for enqueue and dequeue operation
        //higher concurrency between producers and consumers
        BlockingQueue<Integer> queue3 = new PriorityBlockingQueue<>();
        //unbounded
        //Binary heap as array and can grow dynamically
        //Head is based on their natural ordering or a provided Comparator like priority queue
        queue3 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        BlockingQueue<Integer> queue4 = new SynchronousQueue<>();
        //each insert operation must wait for corresponding remove operation by another thread and vice versa
        //it cannot store elements

    }
}
