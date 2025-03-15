package com.demo.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Java uses DoublyLinkedList by default internally
        //LinkedList is slower in RandomAccess, because it has to traverse from beginning till the required index
        //LinkedList is faster in Insertion and Deletion, because it doesn't require shifting elements
        //LinkedList is greater in memory overhead, because each node stores data + reference
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.get(1); //O(n) --> loop required to access, so complexity becomes O(n)
        linkedList.addFirst(8); //O(1) --> loop NOT required to access, so complexity becomes O(1)
        linkedList.addLast(9); //O(1) --> loop NOT required to access, so complexity becomes O(1)
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println("Original linkedList: " + linkedList);

        System.out.println("----------------------------------------");

        // Example 1: remove() or removeFirst()
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 1 - Before removeFirst(): " + linkedList);
        Integer removedElement1 = linkedList.remove(); // or linkedList.removeFirst();
        System.out.println("Removed element: " + removedElement1);
        System.out.println("After removeFirst(): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 2: removeLast()
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 2 - Before removeLast(): " + linkedList);
        Integer removedElement2 = linkedList.removeLast();
        System.out.println("Removed element: " + removedElement2);
        System.out.println("After removeLast(): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 3: remove(int index)
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 3 - Before remove(2): " + linkedList);
        Integer removedElement3 = linkedList.remove(2); // Removes element at index 2
        System.out.println("Removed element: " + removedElement3);
        System.out.println("After remove(2): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 4: remove(Object o)
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 4 - Before remove(3): " + linkedList);
        boolean isRemoved4 = linkedList.remove((Integer) 3); // Removes first occurrence of 3
        System.out.println("Was element removed? " + isRemoved4);
        System.out.println("After remove(3): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 4b: remove(Object o) - Element not found
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 4b - Before remove(10): " + linkedList);
        boolean isRemoved4b = linkedList.remove((Integer) 10); // 10 is not in the list
        System.out.println("Was element removed? " + isRemoved4b);
        System.out.println("After remove(10): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 5: removeFirstOccurrence(Object o)
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 5 - Before removeFirstOccurrence(3): " + linkedList);
        boolean isRemoved5 = linkedList.removeFirstOccurrence(3);
        System.out.println("Was element removed? " + isRemoved5);
        System.out.println("After removeFirstOccurrence(3): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 6: removeLastOccurrence(Object o)
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 3, 9));
        System.out.println("Example 6 - Before removeLastOccurrence(3): " + linkedList);
        boolean isRemoved6 = linkedList.removeLastOccurrence(3); // Removes the last 3
        System.out.println("Was element removed? " + isRemoved6);
        System.out.println("After removeLastOccurrence(3): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 7: clear()
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 7 - Before clear(): " + linkedList);
        linkedList.clear();
        System.out.println("After clear(): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 8a: poll() or pollFirst()
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 8a - Before poll(): " + linkedList);
        Integer removedElement8a = linkedList.poll(); // or linkedList.pollFirst();
        System.out.println("Removed element: " + removedElement8a);
        System.out.println("After poll(): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 8b: pollLast()
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 8b - Before pollLast(): " + linkedList);
        Integer removedElement8b = linkedList.pollLast();
        System.out.println("Removed element: " + removedElement8b);
        System.out.println("After pollLast(): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 8c: poll() on an empty list
        linkedList = new LinkedList<>();
        System.out.println("Example 8c - Before poll() on empty list: " + linkedList);
        Integer removedElement8c = linkedList.poll();
        System.out.println("Removed element: " + removedElement8c);
        System.out.println("After poll(): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 9a: removeIf() - Remove elements greater than 5
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 9a - Before removeIf(x > 5): " + linkedList);
        boolean isRemoved9a = linkedList.removeIf(x -> x > 5); // Removes elements greater than 5
        System.out.println("Were elements removed? " + isRemoved9a);
        System.out.println("After removeIf(x > 5): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 9b: removeIf() - No elements satisfy the predicate (x > 10)
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 9b - Before removeIf(x > 10): " + linkedList);
        boolean isRemoved9b = linkedList.removeIf(x -> x > 10); // No elements greater than 10
        System.out.println("Were elements removed? " + isRemoved9b);
        System.out.println("After removeIf(x > 10): " + linkedList);
        System.out.println("----------------------------------------");

        // Example 10: removeAll(Collection<?> c)
        linkedList = new LinkedList<>(Arrays.asList(8, 1, 2, 3, 4, 9));
        System.out.println("Example 10 - Before removeAll([1, 3, 9]): " + linkedList);
        List<Integer> toRemove = Arrays.asList(1, 3, 9); // Elements to remove
        boolean isModified = linkedList.removeAll(toRemove); // Removes all occurrences of 1, 3, 9
        System.out.println("Was the list modified? " + isModified);
        System.out.println("After removeAll([1, 3, 9]): " + linkedList);
        System.out.println("----------------------------------------");
    }
}
