package com.demo.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        //double-ended queue
        //insertion and deletion at both ends
        //versatile than regular stack and queue because it supports all the operation of both stack and queue
        /**
         * Insertion Methods for ArrayDeque:
         *
         * - addFirst(E e): Inserts the specified element at the front.
         *
         * - addLast(E e): Inserts the specified element at the end.
         *
         * - offerFirst(E e): Inserts the specified element at the front if possible.
         *
         * - offerLast(E e): Inserts the specified element at the end if possible.
         **/

        /**
         * Removal Methods for ArrayDeque:
         *
         * - removeFirst(): Retrieves and removes the first element.
         *
         * - removeLast(): Retrieves and removes the last element.
         *
         * - pollFirst(): Retrieves and removes the first element, or returns null if empty.
         *
         * - pollLast(): Retrieves and removes the last element, or returns null if empty.
         **/

        /**
         * Examination Methods for ArrayDeque:
         *
         * - getFirst(): Retrieves, but does not remove, the first element.
         *
         * - getLast(): Retrieves, but does not remove, the last element.
         *
         * - peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
         *
         * - peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.
         **/

        /**
         * Stack Methods for ArrayDeque:
         *
         * - push(E e): Adds an element at the front (equivalent to addFirst(E e)).
         *
         * - pop(): Removes and returns the first element (equivalent to removeFirst()).
         **/
        Deque<Integer> deque1 = new ArrayDeque<>();

        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        //Current Deque: [5,10,20,25]
        System.out.println("First Element: "+deque1.getFirst()); //Output 5
        System.out.println("Last Element: "+deque1.getLast()); //Output 25
        deque1.removeFirst(); //Removes 5
        deque1.pollLast(); //Removes 25
        //Current Deque: [10,20]
        for (int i: deque1){
            System.out.println(i);
        }

        Deque<Integer> deque2 = new LinkedList<>();
        deque2.addFirst(10);
        deque2.addLast(20);
        deque2.offerFirst(5);
        deque2.offerLast(25);
        //Current Deque: [5,10,20,25]
        System.out.println("First Element: "+deque2.getFirst()); //Output 5
        System.out.println("Last Element: "+deque2.getLast()); //Output 25
        deque2.removeFirst(); //Removes 5
        deque2.pollLast(); //Removes 25
        //Current Deque: [10,20]
        for (int i: deque2){
            System.out.println(i);
        }

        //if you observe both deque1 and deque2 can perform same operations
        //But ArrayDeque has Faster iterations, low memory and no null allowed
        //So, ArrayDeque is recommended unless frequent insertion is needed somewhere in middle(LinkedList).
        //Internal data structure of ArrayDeque is Circular Array with head and tail
        //So, insertion and deletion will not require shift of elements. just shift head and tail
        //deque2.remove(Object o); --> for deletion in the middle


    }
}
