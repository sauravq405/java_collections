package com.demo.collections;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        //non-blocking, thread-safe, double-ended queue
        //Compare and swap
        //Wherever compare and swap is used, things are non-blocking by nature
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Element 1");
        deque.add("Element 0");
        deque.add("Element 2");
        System.out.println(deque);
        String first = deque.getFirst();
        String last = deque.getLast();
    }
}
