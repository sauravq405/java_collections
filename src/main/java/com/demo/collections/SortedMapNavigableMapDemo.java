package com.demo.collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SortedMapNavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(5, "Five"); //Intellij shortcut - command + shift + up/down arrow to shift line up or down
        navigableMap.put(1, "One");
        navigableMap.put(3, "Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4)); //3
        System.out.println(navigableMap.ceilingKey(3)); //3
        System.out.println(navigableMap.ceilingKey(4)); //5
        Map.Entry<Integer, String> integerStringEntry = navigableMap.higherEntry(1);
        System.out.println(integerStringEntry);
        System.out.println(navigableMap.descendingMap());
        //NavigableMap is for finding closest match
        //

    }
}
