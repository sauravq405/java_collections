package com.demo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationsListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Milk");
        list.add("Omlette");
        list.add("Bread");
        try {
            for (String s : list) {
                if ("Bread".equals(s)) list.add("Butter");
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Proceeding with CopyOnWriteArrayList...");
            list.clear();
        }
        list = new CopyOnWriteArrayList<>();
        list.add("Banana");
        list.add("Milk");
        list.add("Omlette");
        list.add("Bread");
        for (String s : list) {
            if ("Bread".equals(s)) list.add("Butter");
        }
        System.out.println("Breakfast: " + list);
    }
}
