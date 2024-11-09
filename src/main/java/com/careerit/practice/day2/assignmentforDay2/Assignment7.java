package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the billing amount :");
        double amount = sc.nextDouble();
        if(amount > 6000){
            double discount = amount * 0.1;
            amount = amount - discount;
            System.out.println("Your net billing is : " + amount);
        } else {
            System.out.println("Your net billing is : " + amount);
        }
    }
}
