package com.example.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsArrayList {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("Google");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Microsoft");
        companies.add("Facebook");

//        companies.add(25);

        System.out.println("Here are the top " + companies.size() + " companies in the world");
        System.out.println(companies);

        String bestCompany = companies.get(0);
        String secondBestCompany = companies.get(1);
        String lastCompany = companies.get(companies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        companies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + companies);

        companies.remove("Amazon");
        System.out.println("The Company got Deleted in list" +companies);
    }
}
