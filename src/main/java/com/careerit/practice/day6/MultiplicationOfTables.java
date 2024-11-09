package com.careerit.practice.day6;

import java.util.Scanner;

public class MultiplicationOfTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 :");
        int num2 = sc.nextInt();
        for(int i = 1; i <= num1; i++) {
            for(int j = 1; j <= num2; j++) {
                System.out.print(i + " * " + j + " = " + i*j + " ");
                System.out.println();
            }
            System.out.println();

        }
    }
}
