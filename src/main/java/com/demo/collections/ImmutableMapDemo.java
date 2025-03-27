package com.demo.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");
        System.out.println("map1 = "+map1);
        Map<Integer, String> map2 = Collections.unmodifiableMap(map1);
        System.out.println("map2 = "+map2);
        //map2.put(4, "Four"); //throws exception
        Map<Integer, String> map3 = Map.of(1, "One", 2, "Two", 3, "Three");
        //Map.of() is a java 9 solution to create immutable map
        //there is a limitation in Map.of() is that only 10 entries can be added
        Map<Integer, String> map4 = Map.ofEntries(Map.entry(1, "One"), Map.entry(2, "Two"), Map.entry(3, "Three"));
        //Map.ofEntries() overcomes the limitations of Map.of() method.

    }
}
