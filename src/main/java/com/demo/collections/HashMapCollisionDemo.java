package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollisionDemo {
    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        /**
         * Suppose we want to store information about the number of fruits in a store.
         * Here's what we want to store:
         *
         * | Fruit   | Quantity |
         * |---------|----------|
         * | Apple   | 50       |
         * | Banana  | 30       |
         * | Orange  | 80       |
         * | Grape   | 20       |
         */
        fruitMap.put("Apple", 50);
        /**
         * Internal Process
         *
         * The key "Apple" is hashed using its hashCode(). Let's assume "Apple" generates a hashCode of 1083223 (this is just an example value).
         * The hashCode is used to calculate the index in the internal array (bucket array). Let's say the array size is initially 16.
         *
         * index = hashCode % arraySize;
         * index = 1083223 % 16 = 9;
         *
         * This means "Apple" will be stored in bucket 9
         */
        fruitMap.put("Banana", 30);
        //index = 1392244 % 16 = 4
        fruitMap.put("Grape", 20);
        //index = 548734 % 16 = 14
        fruitMap.put("Orange", 20);
        //index = 19332414 % 16 = 14
        /**
         * HashMap Structure (Array of Buckets, size: 16)
         *
         * Index | Bucket (Key-Value Pairs)
         * ------|-------------------------
         * 0     |
         * 1     |
         * 2     |
         * 3     |
         * 4     | ("Banana", 30)
         * 5     |
         * 6     |
         * 7     |
         * 8     |
         * 9     | ("Apple", 50)
         * 10    |
         * 11    |
         * 12    |
         * 13    |
         * 14    | ("Orange", 80) -> ("Grape", 20) // Collision: stored in a linked list
         * 15    |
         */
    }
}
