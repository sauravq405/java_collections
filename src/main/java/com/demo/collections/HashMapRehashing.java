package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapRehashing {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(17, 0.5f); //default 16, 0.75
        //when the internal array reaches a size of 17*0.5 i.e 8, the size is doubled to 16.

        /**
         * HashMap Resizing (Rehashing)
         *
         * HashMap has an internal array size, which by default is 16.
         * When the number of elements (key-value pairs) grows and exceeds a certain load factor (default is 0.75),
         * HashMap automatically resizes the array to hold more data. This process is called rehashing.
         *
         * The default size of the array is 16, so when more than 12 elements (16 * 0.75) are inserted,
         * the HashMap will resize.
         */

        /**
         * During rehashing
         *
         * The array size is doubled.
         *
         * 1. All existing entries are rehashed (i.e., their positions are recalculated) and placed into the new array.
         * 2. This ensures the HashMap continues to perform efficiently even as more data is added.
         */
    }
}
