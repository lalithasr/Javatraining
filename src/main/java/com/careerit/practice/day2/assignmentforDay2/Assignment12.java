package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Y if you have membership or type N :");
        char membership = sc.next().charAt(0);
        System.out.println("Enter the billing amount :");
        double amount = sc.nextDouble();
        if(membership == 'Y') {
            System.out.println("Welcome to our club");
            double discount = amount * 0.1;
            amount = amount - discount;
            System.out.println("Your net billing is : " + amount);
        } else {
            System.out.println("Please take membership to join our club for more discounts");
            double discount = amount * 0.03;
            amount = amount - discount;
            System.out.println("Your net billing is : " + amount);
        }
    }
}
