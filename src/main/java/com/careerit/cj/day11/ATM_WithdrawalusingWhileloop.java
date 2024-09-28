package com.careerit.cj.day11;

import java.util.Scanner;

public class ATM_WithdrawalusingWhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin which you want to choose:");
        int correctPin = sc.nextInt();
        System.out.println("Enter how many attempts you need to try:");
        int attempts = sc.nextInt();
        System.out.println("Enter the pin to withdraw the amount:");
        int pin = sc.nextInt();
        while (pin != correctPin && attempts >= 1) {
            attempts--;
            System.out.println("Enter the correct pin you have " + attempts + " attempts left");
            pin = sc.nextInt();
        }
        if (pin == correctPin) {
            System.out.println("Enter the amount you want to withdraw:");
            int amount = sc.nextInt();
            System.out.println("Amount " + amount + " is withdrawn successfully");
        } else {
            System.out.println("Your card is blocked, please contact the bank");
        }
        sc.close();

    }
}
