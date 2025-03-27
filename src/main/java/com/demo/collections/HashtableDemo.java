package com.demo.collections;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        //just like hashmap
        //legacy class
        //introduced in jdk 1.0
        //it is synchronized
        //slower than hashmap
        //null key, null values not allowed
        //better alternative ConcurrentHashmap
        //only linkedlist in case of collision
        //all methods are synchronized, including get()
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Orange");
        System.out.println(hashtable);
        System.out.println("Value for key 1: "+hashtable.get(1));
        System.out.println("Does key 1 exist?: "+hashtable.containsKey(1));
    }
}
