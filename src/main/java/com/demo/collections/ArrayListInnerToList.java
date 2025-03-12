package com.demo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListInnerToList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        System.out.println("list1: "+list1.getClass().getName());

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("list2: "+list2.getClass().getName());
        
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list3 = Arrays.asList(arr);
        System.out.println("list3: "+list3.getClass().getName());

         //list1 is resizable
        //list2 and list3 are fixed in size

        System.out.println("list2: "+list2);
        System.out.println("list3: "+list3);

        list2.set(3, 25);
        list3.set(3, 70);

        System.out.println("list2: "+list2);
        System.out.println("list3: "+list3);

    }
}
