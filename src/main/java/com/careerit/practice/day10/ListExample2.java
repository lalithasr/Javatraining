package com.careerit.practice.day10;

import java.util.*;

public class ListExample2 {
    public static void main(String[] args) {
        String names1 = "Venkat, Lalitha, Ravi, Charan, Praveen";
        String names2 = "Krish, Manoj, Ravi, Charan, Praveen";
        String[] arr1 = names1.split(",");
        String[] arr2 = names2.split(",");
        List<String> names = new ArrayList<>();
        for(String name:arr1){
            if(!names.contains(name)){
                names.add(name);
            }
        }
        for(String name:arr2){
            if(!names.contains(name)){
                names.add(name);
            }
        }
        System.out.println(" The total unique names are : "+names.size());
        System.out.println(names);
        System.out.println(names.contains("Venkat"));
        System.out.println(names.contains("Krish"));
    }
}
