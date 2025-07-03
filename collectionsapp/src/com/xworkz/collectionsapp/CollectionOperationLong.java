package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionOperationLong {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(78965412375l);
        collection.add(85236997412l);
        collection.add(75315968426l);
        collection.add(95123647816l);
        collection.add(47852366476l);

        Collection collection1 = new ArrayList();
        collection1.add(75369985544l);
        collection1.add(75362215544l);
        collection1.add(75369635544l);
        collection1.add(75364785544l);
        collection1.add(75364455544l);


        System.out.println("Long : "+collection);
        System.out.println("Long : "+collection1);

        collection1.addAll(collection);
        System.out.println("addAll : "+collection1);

        collection1.remove(75315968426l);
        System.out.println("remove : "+collection1);

        collection1.containsAll(collection);
        System.out.println("ContainAll : "+collection1);

        collection1.retainAll(collection);
        System.out.println("retainAll : "+collection1);

        System.out.println("ContainAll : "+collection1.containsAll(collection));

        System.out.println("Contains : "+collection1.contains(75364785544l));

        collection.removeAll(collection);
        System.out.println("removeAll : "+collection+collection1);

        collection1.clear();
        System.out.println("clear : "+collection1);
    }
}
