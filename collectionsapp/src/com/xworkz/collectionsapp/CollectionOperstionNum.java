package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionOperstionNum {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(258);
        collection.add(568);
        collection.add(9874);
        collection.add(4578);
        collection.add(5698);

        Collection collection1 =new ArrayList();
        collection1.add(7854);
        collection1.add(5675);
        collection1.add(2988);
        collection1.add(4457);
        collection1.add(5563);

        System.out.println("collection : "+collection);
        System.out.println("collection1 : "+collection1);

        collection1.addAll(collection);
        System.out.println("addAll :"+collection1);

        collection1.remove(2988);
        System.out.println("remove : "+collection1);

        collection1.containsAll(collection);
        System.out.println("containsAll : "+collection1);

        collection1.retainAll(collection);
        System.out.println("retainAll : "+collection1);

        collection1.removeAll(collection);
        System.out.println("removeAll "+collection1);

        collection.add(598);
        collection.add(555);
        collection.add(753);

        collection.contains(555);
        System.out.println("contains : "+collection);



        collection1.clear();
        System.out.println("clear : "+collection1);

    }
}
