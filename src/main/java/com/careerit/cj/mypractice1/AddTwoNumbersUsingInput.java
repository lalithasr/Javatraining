package com.careerit.cj.mypractice1;

import java.util.Scanner;

public class AddTwoNumbersUsingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + c);
    }
}
