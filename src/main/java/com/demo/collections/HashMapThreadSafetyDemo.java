package com.demo.collections;

import java.util.HashMap;

public class HashMapThreadSafetyDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });
        t1.start();
        t2.start();
        try{
          t1.join();
          t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of map = "+map.size());
    }
}
