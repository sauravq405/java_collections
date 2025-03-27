package com.demo.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        //Java 7 -> segment based locking -> entire lock divided into segments -> 16 segments -> smaller 16 hashmaps
        //--> independent locks in each hashmap
        //one segment being locked at a time
        //i.e. only segment being written to or read from is locked
        //read: operation doesn't require locking unless there is a write operation on the same segment simultaneously
        //write: lock

        //java 8 -> no segmentation
        //compare & swap approach -> no locking except resizing or collision
        //Thread A saw x = 42
        //Thread B work is to change x to 50
        //Now, under compare-and-swap approach
        //if x is still 42, change it to 50 else don't change and retry
        // basically retry is what is replacing lock
        //if cas is failing multiple times, threads wait for sometime, to avoid cpu wastage
        //put -- index
        // here capacity increase is not similar to hashmap where new capacity = old capacity * load factor
        //here capacity goes through incremental
    }
}
