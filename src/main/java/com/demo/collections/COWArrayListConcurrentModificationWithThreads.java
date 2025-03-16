package com.demo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class COWArrayListConcurrentModificationWithThreads {

    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        IntStream.rangeClosed(1, 5).forEach(i -> list.add(i));

        Thread readerThread = new Thread(() -> {
            try{
                while(true){
                    for (int i: list) {
                        System.out.println("reading "+i);
                        Thread.sleep(100); //small delay to simulate reading work
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        });

        Thread writerThread = new Thread(() -> {
            try{
                //Addition
                Thread.sleep(500); //delay to allow reading to start first
                int item = 6;
                list.add(5, item);
                System.out.println("added item: "+item);

                //Deletion
                Thread.sleep(500); //time given for reader thread to start
                int removed = list.remove(0);
                System.out.println("Removed item: "+removed);
            }catch(Exception e){
                e.printStackTrace();
            }
        });

        readerThread.start();
        writerThread.start();

        try{
            readerThread.join();
            writerThread.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("final list: "+list);
    }
}
