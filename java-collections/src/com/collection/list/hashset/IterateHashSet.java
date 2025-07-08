package com.collection.list.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateHashSet {
    public static void main(String[] args) {
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Ruby");

        for(String programmingLanguage: programmingLanguages) {
            System.out.println(programmingLanguage);
        }

        Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
        while (programmingLanguageIterator.hasNext()) {
            String programmingLanguage = programmingLanguageIterator.next();
            System.out.println(programmingLanguage);
        }
    }
}
