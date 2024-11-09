package com.careerit.practice.day11;

public class StringExample1 {

    public static void main(String[] args) {
        String name1 = "Core Java";
        String name2 = "Core Java";
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        String name3 = new String("Core Java");
        System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));

    }
}
