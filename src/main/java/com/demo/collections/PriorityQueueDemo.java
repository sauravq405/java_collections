package com.demo.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //part of the Queue interface
        //assigns priority to elements based on requirement
        //orders elements based on their natural ordering
        //think of it this way -> we are not concerned about inside elements but only the ones at the first
        //for primitives, lowest to highest
        //for string, lexicographically
        //custom comparator can be used for customised sorting ordering
        //doesn't allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq); //fifo //not sorted
        System.out.println("pq.peek():outside-loop = "+pq.peek()); //head element/first element/highest priority element
        while (!pq.isEmpty()){
            System.out.println("pq.poll():inside-loop = "+pq.poll()); //poll() -> retrieve and remove
            //most priority item will be on head and this element will be removed
        }
        //internal working
        //PriorityQueue is implemented using min-heap by default (natural ordering)
        //min-heap is a binary tree where every node is less than or equal to the children
        //so smallest element will always be at the top
        //time complexity:
        //deletion -> O(logn)
        //insertion -> O(logn)
        //reading -> O(1)

        //short-cut for time complexity:
        //basically if you iterate through all elements, then O(n)
        //if you iterate through half of elements, then O(logn)

        //For reverse order
        pq.clear();
        pq = new PriorityQueue<>(Comparator.reverseOrder());
        //alternatively
        //pq = new PriorityQueue<>((x, y) -> x - y); //ascending order
        //pq = new PriorityQueue<>((x, y) -> y - x); //descending order

    }
}
