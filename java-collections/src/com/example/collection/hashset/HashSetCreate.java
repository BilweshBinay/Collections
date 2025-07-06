package com.example.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetCreate {
    public static void main(String[] args) {
        Set<String> daysOfWeek = new HashSet<>();

        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
    }
}
