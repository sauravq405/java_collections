package com.demo.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println("queue1.size() = "+queue1.size());
        System.out.println("queue1.remove() = "+queue1.remove()); //throws exception if empty
        System.out.println("queue1.poll() = "+queue1.poll());
        //System.out.println("queue1.element() = "+queue1.element()); //throws exception if empty
        System.out.println("queue1.peek() = "+queue1.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        queue2.add(1);
        queue2.offer(2);
        //queue2.add(3); //throws exception, Queue full
        //queue2.offer(3); // returns true or false
        System.out.println("queue2.offer(3) = "+queue2.offer(3));
    }
}
