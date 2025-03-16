package com.demo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class LinkedListAsStack {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        IntStream.rangeClosed(1, 5).forEach(i -> linkedList.addLast(i)); //equivalent to push() of Stack
        linkedList.getLast(); //equivalent to peek() of Stack
        linkedList.removeLast(); //equivalent to pop() of Stack
        linkedList.indexOf(3); ; //similar to search() of Stack

        //Stack using ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); //equivalent to push() of Stack
        arrayList.add(1);
        arrayList.add(1);
        arrayList.get(arrayList.size() - 1); //equivalent to peek() of Stack
        arrayList.remove(arrayList.size() - 1); //equivalent to pop() of Stack

        //It is not advisable to do Stack things with ArrayList, because
        //Stack is already available
        //Code readability will be better if we use Stack directly instead of ArrayList as Stack

    }
}
