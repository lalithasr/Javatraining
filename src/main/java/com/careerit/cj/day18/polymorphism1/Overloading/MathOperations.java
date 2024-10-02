package com.careerit.cj.day18.polymorphism1.Overloading;

import java.util.Scanner;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        System.out.println("Enter the first double number:");
        double d1 = sc.nextDouble();
        System.out.println("Enter the second double number:");
        double d2 = sc.nextDouble();
        System.out.println("Enter the third double number:");
        double d3 = sc.nextDouble();
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(a, b));
        System.out.println(obj.add(a, b, c));
        System.out.println(obj.add(d1, d2));
        System.out.println(obj.add(d1, d2, d3));
    }
}
