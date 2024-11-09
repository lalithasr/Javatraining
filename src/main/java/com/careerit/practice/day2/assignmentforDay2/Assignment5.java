package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount :");
        Long p = sc.nextLong();
        System.out.println("Enter the rate of interest :");
        double r = sc.nextDouble();
        System.out.println("Enter the time in years :");
        int t = sc.nextInt();
        double si = (p * r * t) / 100;
        System.out.println("The simple interest for the principal amount " + p + " with rate of interest " + r + " and time " + t + " years is " + si);

    }
}
