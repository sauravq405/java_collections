package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<String> arrayToList = List.of(new String[]{"banana", "apple", "date"}); //immutable collection, can't be sorted
        ArrayList<String> list = new ArrayList<>();
        list.addAll(arrayToList);
        list.sort(null); //natural order sorting - alphabetical order
        System.out.println("list: "+list);
        //now sort in order of the length of each words - custom logic, not natural order
        //Comparator -> compare() -> compares two objects of same type and determine their order
        list.sort(new StringLengthComparator()); //custom sorted on the basis of string length
        list.sort((o1, o2) -> o1.length()-o2.length()); //using lambda
        System.out.println("list: "+list);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.clear();
        numbers.add(3);
        numbers.add(5);
        System.out.println("Before sorting: numbers: "+numbers);
        numbers.sort(new IntegerComparator());
        numbers.sort((o1, o2) -> o1-o2); //using lambda
        System.out.println("After sorting: numbers: "+numbers);
    }

    static class StringLengthComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            //return o2.length() - o1.length();
            //return o2.charAt(0) - o1.charAt(0);
            return o1.length() - o2.length();
        }
    }

    static class IntegerComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            //For compare() method to return negative, o1 should come first in the sorting order //ascending order
            //For compare() method to return positive, o2 should come first in the sorting order //descending order
            //For compare() method to return zero, O1 and o2 lie in the same sorting order
            //o1 - o2 -> ascending order
            //o2 - o1 -> descending order
            return o1 - o2;
        }
    }


}
