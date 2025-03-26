package com.demo.collections;

import com.demo.collections.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        //Comparator -> multiple custom sorting logic
        //Comparable -> natural order of sorting
        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 3.8, 0));
        list.add(new Student("Bob", 3.5, 0));
        list.add(new Student("Charlie", 3.9, 0));
        list.add(new Student("David", 3.6, 0));
        list.add(new Student("Adam", 3.7, 0));
        list.add(new Student("Eve", 3.7, 0));
        list.sort(null); //here null will also sort on natural ordering when Student implements Comparable
        System.out.println(list);
    }
}
