package com.demo.collections;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Temple");
        System.out.println(map);
        //If your key is an Enum, then it's more efficient to use EnumMap, instead of HashMap
        //In EnumMap, all the entries of the Enum key is already known to EnumMap
        //No load factor or capacity resizing required
        //No hash-code required for index calculation
        //enums have ordinals already to use instead of indexes
        //order is maintained in the order of enum
        //it's like internally maintaining the size of the enum
        System.out.println("Day.THURSDAY.ordinal(): "+Day.THURSDAY.ordinal());
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}