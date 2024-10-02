package com.careerit.cj.day18.polymorphism1.Overloading;

import java.util.Scanner;

public class AmbiguityExample {

        public void show(int a, long b) {
            System.out.println("int : " + a + " long : " + b);
        }

        public void show(String a, int b) {
            System.out.println("Your name : " + a + " and age is : " + b);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            System.out.println("Enter the long number:");
            long lnum = sc.nextLong();
            System.out.println("Enter the name:");
            String name = sc.next();
            System.out.println("Enter the age:");
            int age = sc.nextInt();
            AmbiguityExample obj = new AmbiguityExample();
            obj.show(name, age);
            obj.show(num, lnum);
        }
}
