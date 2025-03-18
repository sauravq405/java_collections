package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        //Think of Map like a dictionary where words are keys, meanings are values.
        /**
         * Key Characteristics of the Map Interface
         *
         * Key-Value Pairs: Each entry in a Map consists of a key and a value.
         * Unique Keys: No two entries can have the same key.
         * One Value per Key: Each key maps to a single value.
         * Order: Some implementations maintain insertion order (LinkedHashMap),
         * natural order (TreeMap), or no order (HashMap).
         */

        /**
         * Key Characteristics continued
         *
         * Unordered: Does not maintain any order of its elements.
         * Allows null Keys and Values: Can have one null key and multiple null values.
         * Not Synchronized: Not thread-safe; requires external synchronization if used in a multi-threaded context.
         * Performance: Offers constant-time performance (O(1)) for basic operations like get and put,
         * assuming the hash function disperses elements properly.
         */

        Map<Integer, String> rollNumber = new HashMap<>();
        rollNumber.put(1, "Student1");
        rollNumber.put(2, "Student2");
        rollNumber.put(3, "Student3");
        rollNumber.put(4, "Student4");
        rollNumber.put(5, "Student5");

        String value = rollNumber.get(1);
        System.out.println(value);

        Set<Integer> numbers = rollNumber.keySet();
        for(int i: numbers){
            System.out.println(i+" : "+rollNumber.get(i));
        }
        System.out.println();

        Set<Map.Entry<Integer, String>> entries = rollNumber.entrySet();
        for (Map.Entry<Integer, String> entry: entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();

        //Modification
        for (Map.Entry<Integer, String> entry: entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(rollNumber);

        boolean isRemoved = rollNumber.remove(31, "Student31");
        System.out.println("REMOVED? : "+isRemoved);

        System.out.println("rollNumber.containsKey(31): "+rollNumber.containsKey(31));
        System.out.println("rollNumber.containsValue(\"Student31\"): "+rollNumber.containsValue("Student31"));
        System.out.println("rollNumber.containsValue(\"Student1\"): "+rollNumber.containsValue("Student1")); //case-sensitive

        //get(), put(), remove(), containsKey(), containsValue() - all are O(1) complexity


        // Internal structure of HashMap

        /**
         * Basic Components of HashMap
         *
         * Key: The identifier used to store and retrieve values.
         * Hash function: Converts the key into an index to locate the bucket.
         * Bucket: A container that holds the value (and possibly multiple values in case of collisions).
         * Value: The data associated with the key, stored in the bucket.
         */

        /**
         * A hash function is an algorithm that takes an input (or "key") and returns a fixed-size string of bytes, typically a numerical value.
         * The output is known as a hash code, hash value, or simply hash.
         * The primary purpose of a hash function is to map data of arbitrary size to data of fixed size.
         */

        /**
         * Deterministic: The same input will always produce the same output.
         * Fixed Output Size: Regardless of the input size, the hash code has a consistent size (e.g., 32-bit, 64-bit).
         * Efficient Computation: The hash function should compute the hash quickly.
         */

        /**
         * How Data is Stored in HashMap
         *
         * Step 1: Hashing the Key
         * First, the key is passed through a hash function to generate a unique hash code (an integer number).
         * This hash code helps determine where the key-value pair will be stored in the array (called a "bucket array").
         */
        /**
         * Step 2: Calculating the Index
         *
         * The hash code is then used to calculate an index in the array (bucket location) using:
         * int index = hashCode % arraySize;
         * The index decides which bucket will hold this key-value pair.
         * For example, if the array size is 16, the key's hash code will be divided by 16, and the remainder will be the index.
         *
         * NOTE: 16 is the default array size
         */

        /**
         * Step 3: Storing in the Bucket
         *
         * The key-value pair is stored in the bucket at the calculated index.
         * Each bucket can hold multiple key-value pairs (this is called a collision handling mechanism, discussed later).
         */
        /**
         * map.put("apple", 50);
         *
         * - "apple" is the key.
         * - 50 is the value.
         * - The hash code of "apple" is calculated.
         * - The index is found using the hash code.
         * - The pair ("apple", 50) is stored in the corresponding bucket.
         */

        /**
         * How HashMap Retrieves Data
         *
         * When we call get(key), the HashMap follows these steps:
         *
         * Hashing the Key: Similar to insertion, the key is hashed using the same hash function to calculate its hash code.
         * Finding the Index: The hash code is used to find the index of the bucket where the key-value pair is stored.
         * Searching in the Bucket: Once the correct bucket is found, it checks for the key in that bucket. If it finds the key, it returns the associated value.
         */

        /**
         * Handling Collisions
         *
         * Since different keys can generate the same index (called a collision), HashMap uses a technique to handle this situation.
         * Java's HashMap uses Linked Lists (or balanced trees after Java 8) for this.
         *
         * If multiple key-value pairs map to the same bucket, they are stored in a linked list inside the bucket.
         * When a key-value pair is retrieved, the HashMap traverses the linked list, checking each key until it finds a match.
         */

        /**
         * Time Complexity
         *
         * HashMap provides constant time O(1) performance for basic operations like put() and get() (assuming no collisions).
         * However, if there are many collisions, and many entries are stored in the same bucket, the performance can degrade to O(n),
         * where n is the number of elements in that bucket.
         *
         * But after Java 8, if there are too many elements in a bucket, HashMap switches to a balanced tree instead of a linked list to
         * ensure better performance O(log n).
         */

    }
}
