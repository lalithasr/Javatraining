package com.careerit.cj.mypractice1.stringMethodExamples;

public class Example3 {

        public static void main(String[] args) {
            String name = "Core Java";
            String name1 = "team we are";
            String name2 = "Core";
            String name3 = "Java";
            String name5 ="cORE jAVA";
            String name4 = name2 + " " + name3;
            System.out.println("1 : " +name.compareTo(name1) );
            System.out.println("2 : " +name1.compareToIgnoreCase(name));
            System.out.println("3 : " +name.compareTo(name4));
            System.out.println("4 : " +name.contains(name2));
            System.out.println("5 : " +name.contentEquals(name4));
            System.out.println("6 : " +name1.copyValueOf(name.toCharArray()));
            System.out.println("7 : " +name1);
            System.out.println("8 : " +name.equals(name4));
            System.out.println("9 : " +name.endsWith("Java"));
            System.out.println("10 : " +name.equalsIgnoreCase(name5));
            System.out.println("11 : " +name.equals(name5));

        }
}
