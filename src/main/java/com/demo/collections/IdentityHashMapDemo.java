package com.demo.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String, Integer> map = new HashMap<>();
        //hashcode and equals of String class is checked
        map.put(key1, 1);
        map.put(key2, 2);
        //System.out.println(key1.equals(key2)); // if true, then replace
        System.out.println(map);
        System.out.println("String class hashcode: "+key1.hashCode()); //based on content
        System.out.println("String class hashcode: "+key2.hashCode()); //based on content
        map.clear();
        map = new IdentityHashMap<>();
        //hashcode of Object class is checked (based on new keyword, hashcode will be different)
        //and == is used for memory address comparison
        //IdentityHashCode is ObjectClassHashCode
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
        System.out.println("Object class hashcode: "+System.identityHashCode(key1)); //based on memory-address
        System.out.println("Object class hashcode: "+System.identityHashCode(key2)); //based on memory-address
        System.out.println();
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("String pool hashcode: "+System.identityHashCode(s1)); //based on memory-address
        System.out.println("String pool hashcode: "+System.identityHashCode(s2)); //based on memory-address
    }
}
