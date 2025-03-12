package com.demo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

        ArrayList<Integer> list4 = new ArrayList<>(list2); //modifiable
        list4.add(12);
        System.out.println("list4: "+list4);

        List<Integer> list5 = List.of(10, 11, 22, 33); //unmodifiable
        list4.addAll(list5); //modifying
        System.out.println("list4: "+list4);

        boolean has10= list4.contains(10); //10 is element not index
        System.out.println("list4.contains(10): "+has10);

        list4.remove(10); //remove(primitive) -> removes based on index
        list4.remove(Integer.valueOf(10)); //remove(object) -> removes based on element
        System.out.println("list4: "+list4);

        has10= list4.contains(10); //10 is element not index
        System.out.println("list4.contains(10): "+has10);

        Object[] array = list4.toArray();
        Integer[] integers = list4.toArray(new Integer[0]);//we allot size as 0 so that new internal array is created
        // and most importantly on the type
        System.out.println("integer array from list4: "+Arrays.toString(integers));

        Collections.sort(list4);
        System.out.println("list4: "+list4);



    }
}
