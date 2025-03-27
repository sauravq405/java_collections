package com.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i: list){
            System.out.println(i);
        }
        //the above for each loop is internally converted to below code
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for (int i: list){
            if(i % 2 == 0) {
                //list.remove(Integer.valueOf(i)); -- throws exception
            }
        }
        iterator = list.iterator(); //re-initialize iterator , since items were added to list AFTER
        while (iterator.hasNext()){
            int i = iterator.next();
            if(i % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(list);
        ListIterator<Integer> listIterator = list.listIterator();
        //listIterator has even more methods
        while (listIterator.hasNext()){
            //listIterator.set(0); replace operation
        }
    }
}
