package com.example.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetSearchOperation {
    public static void main(String[] args) {
        Set<String> popularCities = new HashSet<>();

        popularCities.add("London");
        popularCities.add("New York");
        popularCities.add("Paris");
        popularCities.add("Dubai");

        System.out.println("Number of cities in the HashSet " + popularCities.size());

        String cityName = "London";
        if(popularCities.contains(cityName)) {
            System.out.println(cityName + " is in the popular cities set.");
        } else {
            System.out.println(cityName + " is not in the popular cities set.");
        }
    }
}
