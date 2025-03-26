package com.demo.collections;

import com.demo.collections.model.Image;

import java.util.WeakHashMap;

public class WeakhashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> weakHashMap = new WeakHashMap<>();
        //weakHashMap.put(new String("img1"), new Image("Image 1")); //instead of string literals, string objects are used for weak reference
        //weakHashMap.put(new String("img2"), new Image("Image 2")); //instead of string literals, string objects are used for weak reference
        loadWeakHashMap(weakHashMap); //another way of making references weak, even by using string keys
        System.out.println(weakHashMap);
        System.gc(); //suggesting the JVM to do gc after observing a wait period
        simulateWorkWithTimeDelay();
        System.out.println(weakHashMap);

    }

    private static void loadWeakHashMap(WeakHashMap<String, Image> weakHashMap) {
        String key1 = new String("img1");
        String key2 = new String("img2");
        weakHashMap.put(key1, new Image("Image 1"));
        weakHashMap.put(key2, new Image("Image 2"));
    }

    private static void simulateWorkWithTimeDelay() {
        try {
            System.out.println("Waiting for 10 secs...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
