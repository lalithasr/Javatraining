package com.careerit.practice.day11;

public class StringExample {
    public static void main(String[] args) {
        String name1 = "Core";
        String name2 = "Java";
        String name3 = name1 + name2;
        String name4 = "CoreJava";
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));
        System.out.println(name3.intern() == name4);

    }
}
