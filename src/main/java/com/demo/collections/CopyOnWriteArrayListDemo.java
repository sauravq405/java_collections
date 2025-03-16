package com.demo.collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        //CopyOnWriteArrayList --
        //"Copy On Write" means whenever a write operation happens
        //like adding or removing an element
        //instead of directly modifying the existing list
        //a new copy of the existing list is created, and modification is applied to that list
        //this ensures that other threads reading the list, while it's being modified, remains unaffected

        //Read operations: Fast and direct, since they happen on a stable list without interference from modifications.
        //Write operations: A new copy of the list is created for every modification.
        //The reference to this list is then updated, so that subsequent read use this new list.
        //So that, future reads happen on latest data.

        //use case -> use this in scenarios where read is more and write is less.


    }
}
