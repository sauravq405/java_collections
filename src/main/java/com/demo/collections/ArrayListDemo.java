package com.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(55);
        list.add(80);
        System.out.println("list.get(0): "+list.get(0));
        System.out.println("list.get(3): "+list.get(3));
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int x: list){
            System.out.println(x);
        }
        list.remove(3);
        for(int x: list){
            System.out.println(x);
        }
        list.add(80);
        for(int x: list){
            System.out.println(x);
        }
        list.add(3, 50);
        System.out.println("Added element at 3rd index");
        for(int x: list){
            System.out.println(x);
        }
        list.set(4, 90);
        System.out.println("Replaced element at 4th index");
        for(int x: list){
            System.out.println(x);
        }
        System.out.println("list = "+list);

    }
}
