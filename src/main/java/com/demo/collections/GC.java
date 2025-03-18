package com.demo.collections;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", "16 Pro Max"); //STRONG REFERENCE
        System.out.println(phone);
        phone = null; //here new Phone("Apple", "16 Pro Max") will be Garbage Collected
        //System.gc(); NOT RECOMMENDED TO MAKE EXPLICIT CALLS TO GARBAGE COLLECTOR
        System.out.println(phone);
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Nokia", "105"));
        System.out.println(phoneWeakReference.get());
        System.gc(); //suggesting JVM to invoke Garbage collection
        try{
            Thread.sleep(10000);
        }catch (Exception ignored){ //variable name ignored has a significance in removing warning from catch keyword
        }
        System.out.println(phoneWeakReference.get()); //should print null
    }
}

class Phone{
    String brand;
    String model;
    public Phone(){
        super();
    }
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}