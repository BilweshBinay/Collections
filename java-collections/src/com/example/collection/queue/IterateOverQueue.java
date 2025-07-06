package com.example.collection.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterateOverQueue {
    public static void main(String[] args) {
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("John");
        waitingQueue.add("Brad");
        waitingQueue.add("Angelina");
        waitingQueue.add("Julia");

        Iterator<String> waitingQueueIterator = waitingQueue.iterator();

        System.out.println("Iterating over a Queue using iterator()");
        waitingQueueIterator = waitingQueue.iterator();
        waitingQueueIterator.forEachRemaining(name -> {
            System.out.println(name);
        });

//        Replace this lambda with method reference
//        waitingQueueIterator.forEachRemaining(System.out::println);

        System.out.println("Iterating over a Queue using simple for-each loop");
        for(String name: waitingQueue) {
            System.out.println(name);
        }

        String name = "Julia";
        if(waitingQueue.contains(name)) {
            System.out.println("WaitingQueue contains " + name);
        } else {
            System.out.println("Waiting Queue doesn't contain " + name);
        }
    }
}
