package com.demo.collections;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("capacity = "+vector.capacity()); //default is 10; capacity is NOT equal to size (number of elements).


        vector = new Vector<>(5);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("1. capacity = "+vector.capacity());
        vector.add(1);
        System.out.println("2. capacity = "+vector.capacity()); //here default size increase = size * 2

        vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("3. capacity = "+vector.capacity());
        vector.add(1);
        System.out.println("4. capacity = "+vector.capacity()); //when capacityIncrement is specified, it's added, rather than multiplied
        //increased capacity = initial capacity + capacityIncrement
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("5. capacity = "+vector.capacity());//when capacityIncrement is specified, it's added, rather than multiplied
        //new increased capacity = old increased capacity + capacityIncrement

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        vector = new Vector<>(linkedList);
        System.out.println("6. vector with collection = "+vector);
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("vector element at "+i+" = "+vector.get(i));
        }

    }
}
