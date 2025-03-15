package com.demo.collections;

public class LinkedListImpl {
    public static void main(String[] args) {
        Node node1 = new Node();
        node1.value = 1;
        node1.next = null;
        Node node2 = new Node();
        node2.value = 2;
        node2.next = null;
        node1.next = node2;

    }
}

class Node{
    int value;
    Node next;
}
