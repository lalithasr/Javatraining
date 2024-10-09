package com.careerit.cj.hashset;

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<String>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Fig");
        // Addition of duplicate elements
        fruits.add("Apple");
        fruits.add("Mango");
        // Addition of null values
        fruits.add(null);
        fruits.add(null);

        // Displaying HashSet elements
        System.out.println("Fruits added to the HashSet: " + fruits);

        if(fruits.contains("Apple")) {
            System.out.println("Apple is present in the HashSet");
        }

        fruits.remove(null);
        System.out.println("After removing null: "+fruits);
        System.out.println("Total there are "+fruits.size() + " fruits in the Basket");
        System.out.println("Is Market empty? "+fruits.isEmpty() + "\n" + "There are different fruits in the Basket : "+ fruits);
        fruits.clear();
    }
}
