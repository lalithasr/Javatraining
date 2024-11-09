package com.careerit.practice.day4;

import java.util.Scanner;

public class SwappingofTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int a = sc.nextInt();
        System.out.println("Enter the number2 :");
        int b = sc.nextInt();
        System.out.println("Before swapping a=" + a + " b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a=" + a + " b=" + b);
    }
}
