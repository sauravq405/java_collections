package com.demo.collections;

public class LinkedListDataStructure {

    public static void main(String[] args) {
        //every element in linkedlist is a node
        //node = data + pointer (reference address to next element)
        //last node points to null


        /* Representation of a Linked List Node
        Each Node contains:
        - Data: The value stored in the node (e.g., 1, 2, 3)
        - Pointer: A reference to the next node in the list

        Node Structure:
        Node -> Data
             -> Pointer

        Example Linked List:
        Node 1: [Data: 1] -> [Data: 2] -> [Data: 3] -> null
                   |            |            |
                   v            v            v
                  Pointer       Pointer      Pointer
      */


       /* Representation of a Doubly Linked List Node
   Each Node contains:
   - Data: The value stored in the node (e.g., 1, 2, 3)
   - Previous Pointer: A reference to the previous node in the list
   - Next Pointer: A reference to the next node in the list

   Node Structure:
   Node -> Data
         -> Previous Pointer
         -> Next Pointer

   Example Doubly Linked List:
   null <- [Data: 1] <-> [Data: 2] <-> [Data: 3] -> null
            |              |              |
            v              v              v
   Previous  Next      Previous  Next    Previous  Next
     */



      /* Representation of a Circular Linked List Node
   Each Node contains:
   - Data: The value stored in the node (e.g., 1, 2, 3)
   - Next Pointer: A reference to the next node in the list, with the last node pointing back to the first node

   Node Structure:
   Node -> Data
         -> Next Pointer

   Example Circular Linked List:
   [Data: 1] -> [Data: 2] -> [Data: 3]
       ^              |              |
       |              v              |
       +----------------------------+
   (The last node points back to the first node, forming a loop)
    */
    }
}
