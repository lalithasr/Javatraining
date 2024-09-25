package com.careerit.cj.day6;

import java.util.Scanner;

public class ArthimeticOperatorClass {
    int x;
    int y;
    public static void add(int x, int y){
        int sum = x + y;
        System.out.println("The sum of "+ x + " and " + y + " is " + sum);
    }
    public static void sub(int x, int y){
        int diff = x - y;
        System.out.println("The diff of "+ x + " and " + y + " is " + diff);
    }
    public static void mul(int x, int y){
        int multiply = x * y;
        System.out.println("The product of "+ x + " and " + y + " is " + multiply);
    }
    public static void div(int x, int y){
        int divide = x / y;
        System.out.println("The division of "+ x + " and " + y + " is " + divide);
    }
    public static void mod(int x, int y){
        int mod = x % y;
        System.out.println("The mod of "+ x + " and " + y + " is " + mod);
    }
    public static void inc(int x){
        x++;
        System.out.println("The increment of "+ x + " is " + x);
        ++x;
        System.out.println("The increment of "+ x + " is " + x);
    }
    public static void dec(int x){
        x--;
        System.out.println("The decrement of "+ x + " is " + x);
        --x;
        System.out.println("The decrement of "+ x + " is " + x);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();
        ArthimeticOperatorClass.add(x, y);
        ArthimeticOperatorClass.sub(x, y);
        ArthimeticOperatorClass.mul(x, y);
        ArthimeticOperatorClass.div(x, y);
        ArthimeticOperatorClass.mod(x, y);
        ArthimeticOperatorClass.inc(x);
        ArthimeticOperatorClass.dec(x);
    }

}
