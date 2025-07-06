package com.example.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapIteratorRemove {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Laptop",  5);
        stock.put("Mouse",   0);
        stock.put("Monitor", 3);
        stock.put("Cable",   0);

        System.out.println("Initial stock: " + stock);

        Iterator<Map.Entry<String, Integer>> it = stock.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next(); // Map.Entry entry = (Map.Entry) it.next();
           // int qty = ((Integer) entry.getValue()).intValue();
            if (entry.getValue() == 0) {
                it.remove();
            }
        }

        System.out.println("After removal: " + stock);
    }
}
