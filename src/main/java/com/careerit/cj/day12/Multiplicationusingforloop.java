package com.careerit.cj.day12;

import java.util.Scanner;

public class Multiplicationusingforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("How many times: ");
        int times = sc.nextInt();
        System.out.println("The multiplication table of " + number + " table  is : " );
        for ( int i = 1; i <= times; i++) {
            int result =  number * i;
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
