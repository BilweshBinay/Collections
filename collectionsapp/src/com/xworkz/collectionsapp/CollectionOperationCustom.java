package com.xworkz.collectionsapp;

import com.xworkz.collectionsapp.book.Book;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionOperationCustom {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId(101);
        book.setBookName("The Alchemist");
        Book book1 = new Book();
        book1.setBookId(102);
        book1.setBookName("Ikiga");
        Book book2 = new Book();
        book2.setBookId(103);
        book2.setBookName("Rich Dad Poor Dad");
        Book book3 = new Book();
        book3.setBookId(104);
        book3.setBookName("Sapiens: A Brief History of Humankind");
        Book book4 = new Book();
        book4.setBookId(105);
        book4.setBookName("Think and Grow Rich");


        Collection collection = new ArrayList();
        collection.add(book);
        collection.add(book1);
        collection.add(book2);

        Collection collection1 = new ArrayList();
        collection1.add(book3);
        collection1.add(book4);

        System.out.println(collection);
        System.out.println(collection1);

        collection1.addAll(collection);

        System.out.println("addAll "+collection1);

        collection1.containsAll(collection);
        System.out.println("ContainAll : "+collection1);


        collection1.containsAll(collection);
        System.out.println("ContainAll : "+collection1);

        System.out.println("ContainAll : "+collection1.containsAll(collection));

        System.out.println("Contains : "+collection1.contains(book4));

        collection1.removeAll(collection);
        System.out.println("removeAll : "+collection1);

        collection.clear();
        System.out.println("clear : "+collection+collection1);

        collection1.removeAll(collection1);
        System.out.println("removeAll : "+collection1);
    }
}
