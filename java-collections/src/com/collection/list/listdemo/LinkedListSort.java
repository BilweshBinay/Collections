package com.collection.list.listdemo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSort {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before : " + numbers);

        Collections.sort(numbers);

        System.out.println("After : " + numbers);
    }
}
