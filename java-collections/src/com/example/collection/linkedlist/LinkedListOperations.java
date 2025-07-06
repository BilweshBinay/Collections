package com.example.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> chocolates = new LinkedList<>();

        chocolates.add("Dairy Milk");
        chocolates.add("KitKat");
        chocolates.add("Snickers");
        chocolates.add("Bounty");
        System.out.println("Initial LinkedList  : " + chocolates);

        chocolates.add(3, "Ferrero Rocher");
        System.out.println("After Adding a chocolate : " + chocolates);

        chocolates.addFirst("Mars");
        System.out.println("Adding a chocolate in first : " + chocolates);

        chocolates.addLast("Toblerone");
        System.out.println("Adding a chocolate in last : " + chocolates);

        chocolates.removeFirst();
        System.out.println("Remove a chocolate in first : " + chocolates);

        chocolates.removeLast();
        System.out.println("Remove a chocolate in last : " + chocolates);

        chocolates.remove("KitKat");
        System.out.println("Remove a chocolate by name : " + chocolates);

        chocolates.clear();
        System.out.println("Clear there is no chocolate : "+chocolates);
    }
}
