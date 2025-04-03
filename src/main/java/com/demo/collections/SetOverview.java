package com.demo.collections;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        //Set is a collection that cannot contain duplicate elements
        //Based on the principle of HashMap
        //Complexity is mostly O(1)
        //Faster operations
        //Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        //Set --> HashSet, LinkedHashSet, TreeSet, EnumSet
        Set<Integer> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> keySet = map.keySet();
        //keys of HashMap are actually Set
        //Set implements Collection interface, so all the methods are similar to List interface
        set.add(70);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(5);
        set.add(69);
        System.out.println(set); //[1, 5, 69, 70]
        //output is free from duplicates
        //output is unordered
        //for ordering use LinkedHashSet
        //for sorted ordering use TreeSet
        //for enum keys, use EnumSet
        //NavigableSet has some more methods to perform boundary operations
        //For thread safety
        Set<Integer> synchronizededSet = Collections.synchronizedSet(set);
        //recommended for thread safety
        ConcurrentSkipListSet<Integer> skipListSet = new ConcurrentSkipListSet<>();
        //unmodifiable set
        Collections.unmodifiableSet(set);
        //recommended
        Set<Integer> integerSet = Set.of(1, 2, 3, 4); //no limit on number of elements, which is 10 in case of Map.of()


    }
}
