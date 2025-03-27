package com.demo.collections;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        //MAP -- SORTED -- THREAD SAFE -- ConcurrentSkipListMap
        //think of it is synchronized TreeMap or thread-safe TreeMap
        //Underlying Data Structure of HashMap: Arrays, LinkedHashMap: Doubly Linked List, TreeMap: Red Black Tree or Self-balancing Tree
        //Underlying Data Structure of HashMap: Skip list
        //SkipList is a probabilistic data structure
        //it allows for efficient search, insertion, deletion operation
        //similar to a sorted linked list
        //multiple layers are maintained
        //due maintaining layers faster access is achieved
        //sample skip list - with multiple layered linked list
        //1-----------5--------9
        //1-----3-----5----7---9
        //1 2 3 4 5 6 7 8 9
        //Skip List is simpler data structure than Red Black Tree or Sef Balancing Tree

        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

    }
}
