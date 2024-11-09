package com.careerit.practice.day12;

public class StringBuilderExample {

        public static void main(String[] args) {
            StringBuilder sb1 = new StringBuilder("Core");
            StringBuilder sb2 = new StringBuilder("Core");
            StringBuilder sb3 = new StringBuilder("CoreJava");
            System.out.println(sb1 == sb2);
            System.out.println(sb1.equals(sb2));
            System.out.println(sb1.toString().equals(sb2.toString()));
            String st = "Hello";
            System.out.println(st.concat("Name"));
            System.out.println(st);

        }
}
