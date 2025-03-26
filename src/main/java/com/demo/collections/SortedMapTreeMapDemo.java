package com.demo.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTreeMapDemo {
    public static void main(String[] args) {
        /**
         * SortedMap Overview:
         *
         * - SortedMap is an interface that extends Map and guarantees that the entries are sorted based on
         *   the keys, either in their natural ordering or by a specified Comparator.
         **/
        SortedMap<String, Integer> map = new TreeMap<>();
        //the key class should be implementing comparable
        //String implements Comparable (natural ordering) and all wrapper classes like Integer, Double etc does
        //or you can provide comparator inside the constructor also: new TreeMap<>((o1, o2) -> o1.length() - o2.length())
        map.put("7", 99);
        map.put("3", 101);
        map.put("5", 98);
        map.put("Arun", 98);
        map.put("Bimal", 98);
        map.put("Chanchal", 98);
        System.out.println(map);
        //SortedMap has some extra methods that are not present in Map
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Chanchal")); //exclude
        System.out.println(map.tailMap("7")); //include
        SortedMap<String, Integer> submap = map.subMap("7", "Bimal"); //exclude
        System.out.println("submap: "+submap);
        map.clear();
        System.out.println();
        System.out.println();
        map = new TreeMap<>((a, b) -> b.compareTo(a)); //reverse //descending
        //(a, b) -> b.compareTo(a) //descending order
        //(a, b) -> a.compareTo(b) //ascending order
        //here we can't use null as a key
        //TreeMap is actually read black tree - self-balancing binary search tree
        //time complexity of put, get, remove method in TreeMap is O(log(n))
        //time complexity of size, clear method in TreeMap is O(n)
        map.put("7", 99);
        map.put("3", 101);
        map.put("5", 98);
        map.put("Arun", 98);
        map.put("Bimal", 98);
        map.put("Chanchal", 98);
        System.out.println(map);
        //SortedMap has some extra methods that are not present in Map
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Chanchal")); //exclude
        System.out.println(map.tailMap("7")); //include


    }
}
