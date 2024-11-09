package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = sc.next();
        System.out.println("Enter the Phone number :");
        String phone = sc.next();
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        if(age <= 18) {
            System.out.println(" Sorry! You need to be at least 18 years old to get membership.");
        } else {
            System.out.println("Congratulations! " + name + " you are eligible for membership.");
        }
    }
}
