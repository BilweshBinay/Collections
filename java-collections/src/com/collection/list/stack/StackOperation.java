package com.collection.list.stack;

import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();

        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack : " + stackOfCards);

        System.out.println("Is Stack empty? : " + stackOfCards.isEmpty());

        System.out.println("Size of Stack : " + stackOfCards.size());

        int position = stackOfCards.search("Queen");

        if(position != -1) {
            int index = stackOfCards.size() - position;
            String element = stackOfCards.get(index);
            System.out.println("Found the element "+element+" at position : " + position);
        } else {
            System.out.println("Element not found");
        }

    }
}
