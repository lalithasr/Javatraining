package com.careerit.practice.day2;

import java.util.Scanner;

public class PowerOfGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("Enter the power :");
        int power = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= power; i++) {
            res *= num;
        }
        System.out.println( num + " power of " + power + " is " + res);
    }
}
