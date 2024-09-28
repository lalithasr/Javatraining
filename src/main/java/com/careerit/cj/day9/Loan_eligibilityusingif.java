package com.careerit.cj.day9;

import java.util.Scanner;

public class Loan_eligibilityusingif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the Customer : ");
        int age = sc.nextInt();
        if (age >= 21) {
            System.out.println("The customer is eligible for loan");
        }
    }
}
