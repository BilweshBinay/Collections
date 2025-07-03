package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionOperationString {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add("Mango");
        Collection collection2 = new ArrayList();
        collection2.add("Apple");
        Collection collection3 = new ArrayList();
        collection3.add("Orange");
        Collection collection4 = new ArrayList();
        collection4.add("Tomato");
        Collection collection5 = new ArrayList();
        collection5.add("Potato");
        Collection collection6 = new ArrayList();
        collection6.add("Brinjal");
        Collection collection7 = new ArrayList();
        collection7.add("Broccoli");
        Collection collection8 = new ArrayList();
        collection8.add("Watermelon");
        Collection collection9 = new ArrayList();
        collection9.add("Kiwi");
        Collection collection10 = new ArrayList();
        collection10.add("Corn");

        System.out.println(collection1);
        System.out.println(collection2);
        System.out.println(collection3);
        System.out.println(collection4);
        System.out.println(collection5);
        System.out.println(collection6);
        System.out.println(collection7);
        System.out.println(collection8);
        System.out.println(collection9);
        System.out.println(collection10);

        collection10.addAll(collection1);
        System.out.println("addAll : "+collection1);

        collection6.remove("Brinjal");
        System.out.println("remove : "+collection6);

        collection10.containsAll(collection2);
        System.out.println("ContainAll : "+collection10);

        collection10.containsAll(collection3);
        System.out.println("ContainAll : "+collection10);

        System.out.println("ContainAll : "+collection10.containsAll(collection4));

        System.out.println("Contains : "+collection10.contains("Brinjal"));

        collection10.removeAll(collection1);
        System.out.println("removeAll : "+collection10);

        collection10.clear();
        System.out.println("clear : "+collection10);

        collection7.removeAll(collection7);
        System.out.println("removeAll : "+collection7);

    }
}
