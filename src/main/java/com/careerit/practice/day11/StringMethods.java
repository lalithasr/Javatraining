package com.careerit.practice.day11;

public class StringMethods {
    public static void main(String[] args){
        String data = "Venkat, Lalitha, Sasi, Ravi, Praveen, Naveen, Suresh, Ramesh";
        String[] arr = data.split(",");
        for(String name: arr){
            System.out.print("Name of the Person : "+name.toUpperCase());
            String shortName = name.trim().substring(0, 3);
            System.out.print(" and their Nick name : " +shortName);
            System.out.println();
        }


    }


}
