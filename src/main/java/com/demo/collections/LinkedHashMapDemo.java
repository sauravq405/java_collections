package com.demo.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //Insertion order is preserved
        //It contains a doubly linked list to maintain insertion order
        //Slightly slower and more memory usage than HashMap
        //O(1) is still the complexity
        //accessOrder = true for accessOrder, false for insertion order
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, false);
        linkedHashMap.put("Mango", 100);
        linkedHashMap.put("Apple", 200);
        linkedHashMap.put("Orange", 300);

        for (Map.Entry<String, Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("---------------------------------------");
        linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);
        linkedHashMap.put("Mango", 100);
        linkedHashMap.put("Apple", 200);
        linkedHashMap.put("Orange", 300);

        //for accessOrder true, accessed object pair moves to the last of the list
        //insertion order is no more preserved
        //least recently used - an algorithm where least recently used used objects are kept at the beginning
        //in a frequently read operation, using lru it becomes easy to find out which objects were read the least of all
        //example use case, if we store everything in cache, it becomes full
        //so we remove the least recently used items from cache
        linkedHashMap.get("Apple");

        for (Map.Entry<String, Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> stringIntegerLinkedHashMap = new LinkedHashMap<>(hashMap);

        hashMap.put("ABC", 100);
        hashMap.put("CDF", 98);
        hashMap.put("ABC", 99);

        hashMap.getOrDefault("PQR", 0); //return the default value if the key doesn't exist
        hashMap.putIfAbsent("ABC", 98); //if the key is already present, don't replace
                                        //if the key is not present, then replace

    }
}
