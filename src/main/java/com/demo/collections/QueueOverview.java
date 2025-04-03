package com.demo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QueueOverview {
    public static void main(String[] args) {
        //A simple data structure that follows First In First Out principle.
        //Elements are added at te end and removed from start
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1); //enqueue
        list.addLast(3); //enqueue
        list.addLast(5); //enqueue
        System.out.println(list);
        list.removeLast(); //dequeue
        //LinkedList can act as Queue as well as Stack
        // the operation of adding to the last in a Queue is called enqueue (In Stack, it's called push)
        // the operation of adding to the last in a Queue is called dequeue (In Stack, it's called pop)
        //In Stack, we get top view of the stack with peek method, using linked list we can call getFirst() method.
        Integer top = list.getFirst(); //peek

        //But these methods of LinkedList has it's own complexity'

    }
}
