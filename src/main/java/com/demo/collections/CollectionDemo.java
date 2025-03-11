package com.demo.collections;

public class CollectionDemo {
    public static void main(String[] args) {
        //Before java 1.2
        //Vector, Stack, Hashtable - Legacy collection classes
        //Problems - Inconsistency, Lack of interoperability, No common interface

        //After collections introduced in java 1.2
        //Features - Unified architecture, interoperability, re-usability, efficiency


        //Collection - root interface
        //List - Order can be preserved, can contain duplicates (ArrayList, LinkedList etc.)
        //Set - Order is not preserved, can not contain duplicates (HashSet, TreeSet etc.)
        //Queue - Similar like list but maintains First In First Out order (PriorityQueue, LinkedList when used as a queue).
        //Dequeue - Double ended queue. Allows insertion and removal from both ends.
        //Map - Stores key value pair like roll no. and student. (HashMap, TreeMap)

        //In collection hierarchy - interfaces are at top and implementing classes are at bottom

        /**
         * Java Collections Framework Hierarchy:
         *
         * Iterable
         * └── Collection
         *     ├── List
         *     │   ├── ArrayList
         *     │   ├── LinkedList
         *     │   ├── Vector
         *     │   ├── Stack
         *     │   └── CopyOnWriteArrayList
         *     ├── Set
         *     │   ├── HashSet
         *     │   ├── LinkedHashSet
         *     │   ├── TreeSet
         *     │   ├── EnumSet
         *     │   ├── ConcurrentSkipListSet
         *     │   ├── SortedSet (interface)
         *     │   └── CopyOnWriteArraySet
         *     └── Queue
         *         ├── LinkedList
         *         ├── PriorityQueue
         *         ├── ArrayDeque
         *         ├── Deque (interface)
         *         │   ├── LinkedList
         *         │   └── ConcurrentLinkedDeque
         *         ├── BlockingQueue (interface)
         *         │   ├── ArrayBlockingQueue
         *         │   ├── LinkedBlockingQueue
         *         │   └── PriorityBlockingQueue
         *         ├── SynchronousQueue
         *         ├── DelayQueue
         *         └── ConcurrentLinkedQueue
         */


        /**
         * Java Map Interface Hierarchy (up to Java 17):
         *
         * Map
         * ├── HashMap
         * ├── LinkedHashMap
         * ├── TreeMap
         * ├── WeakHashMap
         * ├── IdentityHashMap
         * ├── EnumMap
         * ├── Hashtable
         * ├── Properties
         * ├── ConcurrentMap (interface)
         * │   ├── ConcurrentHashMap
         * │   └── ConcurrentNavigableMap (interface)
         * │       └── ConcurrentSkipListMap
         * └── SortedMap (interface)
         *     └── NavigableMap (interface)
         *         ├── TreeMap
         *         └── ConcurrentNavigableMap (interface)
         *             └── ConcurrentSkipListMap
         */

    }
}
