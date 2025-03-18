package com.demo.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;
    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
       LRUCache<String, Integer> lruCache = new LRUCache<>(3);
        lruCache.put("Bob", 99);
        lruCache.put("Alice", 89);
        lruCache.put("Laxman", 91);
        lruCache.put("Vipul", 95); //size exceeding capacity here
        // at this point removeEldestEntry() will be invoked, and Bob will be removed

        System.out.println(lruCache);

        lruCache.clear();
        lruCache.put("Bob", 99);
        lruCache.put("Alice", 89);
        lruCache.put("Laxman", 91);
        lruCache.get("Bob");
        //lruCache.put("Bob", 100); //Alice will get removed
        lruCache.put("Vipul", 95); //Alice will get removed

        //in least recently used - both get() and put() can be treated as "use".

        System.out.println(lruCache);
    }
}
