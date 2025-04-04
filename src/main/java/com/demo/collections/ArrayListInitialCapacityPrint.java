package com.demo.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListInitialCapacityPrint {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>(5); //default capacity: 10
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        Field field = ArrayList.class.getDeclaredField("elementData"); //elementData is internally maintained array field
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("1. ArrayList Capacity: "+elementData.length);

        list.add(1);

        elementData = (Object[]) field.get(list);
        System.out.println("2. ArrayList Capacity: "+elementData.length); //expected to grow 1.5 times

        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);

        elementData = (Object[]) field.get(list);
        System.out.println("3. ArrayList Capacity: "+elementData.length); //expected to shrink, but it won't

        list.trimToSize(); //trimToSize() is available only in ArrayList, not in List

        elementData = (Object[]) field.get(list);
        System.out.println("4. ArrayList Capacity: "+elementData.length); //expected to shrink, and it will shrink

        /*

        NOTE: This program doesn't get executed in IDE.
        The error we're encountering, java.lang.reflect.InaccessibleObjectException,
        occurs because we're trying to use reflection to access a private or restricted field (elementData in ArrayList) in a module (in this case,
        java.base, which contains java.util.ArrayList), but the Java module system (introduced in Java 9) is preventing it.
        This is due to the strong encapsulation enforced by the Java Platform Module System (JPMS).


        // How to run this in command prompt?

        //cd <project-working-directory>/java_collections/src/main/java
        //javac -d . com/demo/collections/ArrayListInitialCapacityPrint.java
        //java --add-opens java.base/java.util=ALL-UNNAMED com.demo.collections.ArrayListInitialCapacityPrint

        OUTPUT:

        saurav-mac:java saurav$ javac -d . com/demo/collections/ArrayListInitialCapacityPrint.java
        saurav-mac:java saurav$ ls
        com
        saurav-mac:java saurav$ java --add-opens java.base/java.util=ALL-UNNAMED com.demo.collections.ArrayListInitialCapacityPrint
        ArrayList capacity: 5

        saurav-mac:java saurav$ javac -d . com/demo/collections/ArrayListInitialCapacityPrint.java
        saurav-mac:java saurav$ java --add-opens java.base/java.util=ALL-UNNAMED com.demo.collections.ArrayListInitialCapacityPrint
        1. ArrayList Capacity: 5
        2. ArrayList Capacity: 7

        saurav-mac:java saurav$ javac -d . com/demo/collections/ArrayListInitialCapacityPrint.java
        saurav-mac:java saurav$ java --add-opens java.base/java.util=ALL-UNNAMED com.demo.collections.ArrayListInitialCapacityPrint
        1. ArrayList Capacity: 5
        2. ArrayList Capacity: 7
        3. ArrayList Capacity: 7

        saurav-mac:java saurav$ javac -d . com/demo/collections/ArrayListInitialCapacityPrint.java
        saurav-mac:java saurav$ java --add-opens java.base/java.util=ALL-UNNAMED com.demo.collections.ArrayListInitialCapacityPrint
        1. ArrayList Capacity: 5
        2. ArrayList Capacity: 7
        3. ArrayList Capacity: 7
        4. ArrayList Capacity: 2
        saurav-mac:java saurav$

        * */

    }
}
