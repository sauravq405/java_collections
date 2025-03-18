package com.demo.collections;

import com.demo.collections.model.Student;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Map<Student, String> students = new HashMap<>();
        Student s1 = new Student("AA", 3.9, 101);
        Student s2 = new Student("BB", 3.5, 100);
        Student s3 = new Student("AA", 3.9, 101);

        students.put(s1, "Engineer"); //hashcode1 --> index1
        students.put(s2, "Designer"); //hashcode2 --> index2
        students.put(s3, "Manager"); //hashcode3 --> index3, despite objects s1 and s3 having same value in fields,
        // hashcode will be different due to new operator.

        students.clear();

        //But if we implement hashCode and equals method in Student class, the hascode can be made same
        // for two objects with identical field values

        students.put(s1, "Engineer"); //hashcode1 --> index1
        students.put(s2, "Designer"); //hashcode2 --> index2
        students.put(s3, "Manager"); //hashcode1 --> index1 --> equals() --> replace

        System.out.println("Size of students: "+students.size());
        System.out.println("Value of 1st element: "+students.get(s1));
        System.out.println("Value of 3rd element: "+students.get(s3));

        System.out.println(students);



        Map<String, Integer> map = new HashMap<>();
        map.put("One", 10); //hashcode1 --> index1
        map.put("Two", 20); //hashcode2 --> index2
        map.put("One", 30); //hashcode1 --> index1 --> equals() --> replace

        System.out.println("Size of map: "+map.size());
        System.out.println("Value of 1st element: "+map.get("One"));
        System.out.println("Value of 3rd element: "+map.get("One"));
    }
}
