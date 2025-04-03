package com.demo.collections;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        //Thread-safe
        //Copy-on-Write mechanism
        //No Duplicate Elements
        //Iterators do not reflect modifications
        CopyOnWriteArraySet<Integer> cows = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> csset = new ConcurrentSkipListSet<>();
        for (int i = 1; i <= 5; i++) {
             cows.add(i);
             csset.add(i);
        }
        System.out.println("CopyOnWriteArraySet = "+cows);
        System.out.println("ConcurrentSkipListSet = "+csset);
        for (int i:cows){
            System.out.println("Reading from CopyOnWriteArraySet: "+i);
            if(i == 5)
              cows.add(6); //will not reflect when the set is iterating
        }
        System.out.println("CopyOnWriteArraySet = "+cows);
        System.out.println();
        for (int i:csset){
            System.out.println("Reading from ConcurrentSkipListSet: "+i);
            if(i == 5)
                csset.add(6); //may or may not reflect when the set is iterating
        }
        System.out.println("ConcurrentSkipListSet = "+csset);

        //ConcurrentSkipListSet is weakly consistent
        //CopyOnWriteArraySet is consistent
        
    }
}
