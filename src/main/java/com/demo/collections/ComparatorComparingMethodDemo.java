package com.demo.collections;

import com.demo.collections.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparingMethodDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 3.9));
        students.add(new Student("David", 3.6));
        students.add(new Student("Eve", 3.7));
        students.add(new Student("Adam", 3.7));
        //sort students in descending order of their gpa -- highest gpa should come first
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa); //natural ascending order
        students.sort(comparator);
        for (Student s : students) {
            System.out.println(s.getName() + ": "+s.getGpa());
        }
        System.out.println();
        comparator = Comparator.comparing(Student::getGpa).reversed(); //descending order
        students.sort(comparator);
        for (Student s : students) {
            System.out.println(s.getName() + ": "+s.getGpa());
        }
        System.out.println();
        //after sorting based on gpa, sort based on alphabets (only for matching gpas) -> thenComparing() is used
        comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);
        Collections.sort(students, Collections.reverseOrder());
        for (Student s : students) {
            System.out.println(s.getName() + ": "+s.getGpa());
        }

    }
}
