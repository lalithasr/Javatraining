package com.careerit.practice.day7;

import java.util.Scanner;

public class FactorialofNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }
}
