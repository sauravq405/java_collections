package com.demo.collections;

public class VectorLegacyClass {
    public static void main(String[] args) {
        //Vector was introduced before collection framework
        //introduced in java 1.0
        //it is synchronized hence thread safe unlike arraylist and linkedlist
        //due to synchronization, there is a over-head in size

        /*
         * Key Features of Vector:
         *
         * - Dynamic Array: Like ArrayList, Vector is a dynamic array that grows automatically
         *   when more elements are added than its current capacity.
         *
         * - Synchronized: All the methods in Vector are synchronized, which makes it thread-safe.
         *   This means multiple threads can work on a Vector without the risk of corrupting the data.
         *   However, this can introduce performance overhead in single-threaded environments.
         *
         * - Legacy Class: Vector was part of Java's original release and is considered a legacy class.
         *   It's generally recommended to use ArrayList in single-threaded environments due to performance considerations.
         *
         * - Resizing Mechanism: When the current capacity of the Vector is exceeded, it doubles
         *   its size by default (or increases by a specific capacity increment if provided).
         *
         * - Random Access: Similar to arrays and ArrayList, Vector allows random access to elements,
         *   making it efficient for accessing elements using an index.
         */


        /*
         * Constructors of Vector:
         *
         * - Vector(): Creates a vector with an initial capacity of 10.
         *
         * - Vector(int initialCapacity): Creates a vector with a specified initial capacity.
         *
         * - Vector(int initialCapacity, int capacityIncrement): Creates a vector with an initial
         *   capacity and capacity increment (how much the vector should grow when its capacity
         *   is exceeded).
         *
         * - Vector(Collection<? extends E> c): Creates a vector containing the elements of the
         *   specified collection.
         */


        /*
         * Methods in Vector:
         *
         * - add(E e): Adds an element at the end.
         *
         * - add(int index, E element): Inserts an element at the specified index.
         *
         * - get(int index): Retrieves the element at the specified index.
         *
         * - set(int index, E element): Replaces the element at the specified index.
         *
         * - remove(Object o): Removes the first occurrence of the specified element.
         *
         * - remove(int index): Removes the element at the specified index.
         *
         * - size(): Returns the number of elements in the vector.
         *
         * - isEmpty(): Checks if the vector is empty.
         *
         * - contains(Object o): Checks if the vector contains the specified element.
         *
         * - clear(): Removes all elements from the vector.
         */

        /*
         * Synchronization and Performance:
         *
         * - Since Vector methods are synchronized, it ensures that only one thread can access the vector at a time.
         *   This makes it thread-safe but can introduce performance overhead in single-threaded environments
         *   because synchronization adds locking and unlocking costs.
         *
         * - In modern Java applications, ArrayList is generally preferred over Vector when synchronization isn't required.
         *   For thread-safe collections, the CopyOnWriteArrayList or ConcurrentHashMap from the java.util.concurrent package
         *   is often recommended instead.
         */
    }
}
