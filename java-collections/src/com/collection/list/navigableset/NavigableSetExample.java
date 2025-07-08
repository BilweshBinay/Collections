package com.collection.list.navigableset;


import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(25);
        set.add(35);
        set.add(15);
        set.add(36);
        set.add(42);

        System.out.println("Set : "+ set);
        System.out.println("Lower set : "+set.lower(10));

        System.out.println("Higher set : "+set.higher(42));

        System.out.println("Floor set : "+set.floor(25));
        System.out.println("Floor set : "+set.floor(36));

        System.out.println("Ceiling set : "+set.ceiling(10));
        System.out.println("Ceiling set : "+set.ceiling(36));

        System.out.println("Poll First : "+set.pollFirst());
        System.out.println("Set  :" +set);
    }
}
