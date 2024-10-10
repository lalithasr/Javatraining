package com.careerit.cj.typecasting;

public class TypeCastingExample {
    public static void main(String[] args) {
        int a = 20;
        float b = a;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        float c = 20.5f;
        int d = (int) c;
        System.out.println("Value of c: " + c);
        System.out.println("Value of d: " + d);
    }
}
