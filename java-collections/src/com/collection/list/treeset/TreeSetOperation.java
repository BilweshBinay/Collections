package com.collection.list.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetOperation {
    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        fruits.add("Apple");
        System.out.println("After adding duplicate element Apple : " + fruits);

        fruits.add("banana");
        System.out.println("After adding banana : " + fruits);

        boolean isRemoved = fruits.remove("banana");
        if(isRemoved) {
            System.out.println("After Removing  : " + fruits);
        }
    }
}
