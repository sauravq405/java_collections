package com.demo.collections;

import com.demo.collections.model.Student;

import java.util.ArrayList;
import java.util.List;

public class CustomObjectComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 3.9));
        students.add(new Student("David", 3.6));
        students.add(new Student("Adam", 3.7));
        students.add(new Student("Eve", 3.7));
        //sort students in descending order of their gpa -- highest gpa should come first
        //students.sort((o1, o2) -> (int) (o1.getGpa() - o2.getGpa())); //BLUNDER -> casting to int will lead to loss of decimal part of double values
        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                //return 0; //for same gpa, insertion order will be maintained in the sorting order
                return o1.getName().compareTo(o2.getName()); //after sorting based on gpa, sort based on alphabets (only for matching gpas)
                //if o1, o2 are strings and o1 comes first in english dictionary then o1.compareTo(o2) gives Negative
                //if o1 comes later in english dictionary then o1.compareTo(o2) gives Positive
                //it's called lexicographically comparison
                /*
                "apple".compareTo("banana")   // Returns a negative value (-1 or another negative number)
                "grape".compareTo("grapefruit")  // Returns a negative value (prefix case)
                "zebra".compareTo("apple")   // Returns a positive value
                "hello".compareTo("hello")   // Returns 0 (both are equal)
                 */
            }
        });
        for (Student s : students) {
            System.out.println(s.getName() + ": "+s.getGpa());
        }
    }
}
