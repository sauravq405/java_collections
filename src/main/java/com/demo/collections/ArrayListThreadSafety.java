package com.demo.collections;

import java.util.ArrayList;

public class ArrayListThreadSafety {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
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
        System.out.println("total size: "+arrayList.size());

    }
}
