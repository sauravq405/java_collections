package com.demo.collections;

public class HashCollisionSimulator {

    public static void main(String[] args) {
        System.out.println(simpleHash("ABC")); //8
        System.out.println(simpleHash("CBA")); //8
        //Same hash key returned for two different keys
        //This will lead to collision in hashmap
        /**
         * Internal array structure of HashMap (before Java 8 treeification):
         * Each bucket contains a LinkedList to handle collisions.
         *
         * Index:   0       1       2       3       4
         *        +-------+-------+-------+-------+-------+
         *        | LL    | LL    | LL    | LL    | LL    |
         *        +-------+-------+-------+-------+-------+
         * LL = LinkedList storing key-value pairs for that bucket.
         *
         * Issue: If many keys hash to the same bucket, searching or inserting in the LinkedList
         *        takes O(n) time, where n is the number of entries in that bucket, leading to
         *        performance degradation with high collision rates.
         *
         **/

        /**
         * Internal array structure of HashMap (Java 8 with treeification):
         * Each bucket starts as a LinkedList but switches to a balanced tree if collisions exceed a threshold.
         * Default threshold = 8
         *
         * Index:   0       1       2       3       4
         *        +-------+-------+-------+-------+-------+
         *        | BT    | BT    | BT    | BT    | BT    |
         *        +-------+-------+-------+-------+-------+
         * BT = Balanced Tree (red-black tree) of key-value pairs for that bucket.
         * Benefit: When collisions are high, operations in the tree take O(log n) time instead of O(n),
         *          improving performance over the LinkedList approach.
         *
         *  Red-Black Tree = Self-balancing binary search tree.
         **/
        /**
         * class Node<K, V> {
         *     final int hash; // hash code of the key
         *     final K key;    // the key itself
         *     V value;        // the value associated with the key
         *     Node<K, V> next; // pointer to the next node in case of a collision (linked list)
         * }
         */
    }

    /*
    Not actual hash function, just a demonstration to calculate simple hash method
     */
    private static int simpleHash(String s) {
        int sum = 0;
        for(char c:s.toCharArray()) {
            sum += (int) c;
        }
        return sum % 10;
    }
}
