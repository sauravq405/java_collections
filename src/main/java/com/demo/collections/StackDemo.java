package com.demo.collections;

import java.util.Stack;
import java.util.stream.IntStream;

public class StackDemo {
    public static void main(String[] args) {
        //Stack extends Vector
        //Follows LIFO -> Last In First Out
        //It's a legacy class
        //introduced in Java 1.0
        //Stack is thread safe
        /*
         * ArrayList -> Sequential (O(1))
         * Linked List -> Insertion & Deletion
         * Vector -> Sequential (O(1))
         * Stack -> LIFO
         */
        /*
         * LIFO Structure: Stack follows the Last-In-First-Out (LIFO) principle,
         * where the last element added is the first one to be removed.
         *
         * Inheritance: Stack is a subclass of Vector,
         * which means it inherits all the features of a dynamic array but is constrained by the stack's LIFO nature.
         */

        Stack<Integer> stack = new Stack<>();
        IntStream.rangeClosed(1, 5).forEach(i -> stack.push(i));
        System.out.println("stack: "+stack);
        Integer removedElement = stack.pop();
        System.out.println("stack: "+stack);
        Integer topElement = stack.peek(); //view top element, not remove.
        System.out.println("topElement: "+topElement);
        System.out.println("stack: "+stack);
        System.out.println("stack.isEmpty(): "+stack.isEmpty());
        System.out.println("stack.size(): "+stack.size());
        int index = stack.search(3); //similar to contains() but returns an index, if found. -1 if not found.
        //Remember that search() is based on 1-based index, i.e. index starts from 1 from the top,
        //i.e top position is at 1
        System.out.println("stack.search(3): "+index);
        index = stack.search(76); //similar to contains() but returns an index, if found. -1 if not found.
        //Remember that search() is based on 1-based index, i.e. index starts from 1 from the top,
        //i.e top position is at 1
        System.out.println("stack.search(76): "+index);

    }
}
