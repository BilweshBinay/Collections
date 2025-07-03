package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionOperationChar {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");
        collection.add("E");

        Collection collection1 = new ArrayList();
        collection1.add("F");
        collection1.add("G");
        collection1.add("H");
        collection1.add("I");
        collection1.add("J");

        System.out.println("char : "+collection);
        System.out.println("Char : "+collection1);

        collection1.addAll(collection);
        System.out.println("addAll : "+collection1);

        collection1.remove("I");
        System.out.println("remove : "+collection1);

        collection1.containsAll(collection1);
        System.out.println("ContainAll : "+collection1+collection);

        collection1.retainAll(collection);
        System.out.println("retainAll : "+collection1+collection);

        System.out.println("ContainAll : "+collection1.containsAll(collection));

        System.out.println("Contains : "+collection1.contains("H"));

        collection1.removeAll(collection1);
        System.out.println("removeAll : "+collection1+collection);

        collection.clear();
        System.out.println("clear : "+collection);


    }
}
