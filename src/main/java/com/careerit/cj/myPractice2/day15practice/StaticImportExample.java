package com.careerit.cj.myPractice2.day15practice;

public class StaticImportExample {

    public static int max(int a, int b){
        return a > b ? a : b;
    }
    public static int min(int a, int b){
        return a < b ? a : b;
    }

    public static int sqrt(int num){
        return (int)Math.sqrt(num);
    }
    public static void main(String[] args) {
       System.out.println(max(10,20));
       System.out.println(max(100,200));
       System.out.println(Math.max(1000,2000));
       System.out.println(Math.min(1000,2000));
       System.out.println(sqrt(16));

    }
}
