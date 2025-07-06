package com.example.collection.treemap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        SortedMap<String, String> fileExtensions = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });

        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");

        System.out.println(fileExtensions);

        String language = "c++";
        String remove = fileExtensions.remove(language);
        if (remove != null) {
            System.out.println("The language is removed" );
        }else {
            System.out.println("The language not found");
        }
        System.out.println(fileExtensions);
    }
}
