package com.careerit.cj.day18.polymorphism1.Overloading;

import java.util.Scanner;

public class TypePromotionExample {

    public void show(int a) {
        System.out.println("int : " + a);
    }

    public void show(long a) {
        System.out.println("long : " + a);
    }

    public void show(float a) {
        System.out.println("float : " + a);
    }

    public void show(double a) {
        System.out.println("double : " + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Enter the long number:");
        long lnum = sc.nextLong();
        System.out.println("Enter the float number:");
        float fnum = sc.nextFloat();
        System.out.println("Enter the double number:");
        double dnum = sc.nextDouble();
        TypePromotionExample obj = new TypePromotionExample();
        obj.show(num);
        obj.show(lnum);
        obj.show(fnum);
        obj.show(dnum);
    }
}
