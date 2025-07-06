package com.example.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateOverLinkedList {
    public static void main(String[] args) {
        LinkedList<String> trees = new LinkedList<>();

        trees.add("Oak");
        trees.add("Maple");
        trees.add("Mahogany");
        trees.add("Redwood");

        System.out.println("forEach + lambda");
        trees.forEach(name -> System.out.println(name));

        System.out.println("iterator()");
        Iterator<String> it = trees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("iterator() + forEachRemaining()");
        it = trees.iterator();
        it.forEachRemaining(System.out::println);

        System.out.println("descendingIterator() (reverse order)");
        Iterator<String> revIt = trees.descendingIterator();
        while (revIt.hasNext()) {
            System.out.println(revIt.next());
        }

        System.out.println("listIterator() starting at end (backwards)");
        ListIterator<String> li = trees.listIterator(trees.size());
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        System.out.println("enhanced for‑each loop ");
        for (String name : trees) {
            System.out.println(name);
        }
    }
}
