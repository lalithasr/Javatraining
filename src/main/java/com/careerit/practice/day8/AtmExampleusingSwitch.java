package com.careerit.practice.day8;

import java.util.Scanner;

public class AtmExampleusingSwitch {

    public static void main(String[] args) {
        int balance = 10000;
        int pin = 1234;
        int count = 0;
        while (true) {
            if (count == 3) {
                System.out.println("Your card is blocked, please contact the bank");
                break;
            }
            System.out.println("Enter the pin:");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the pin:");
            int upin = sc.nextInt();
            if (upin == pin) {
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Balance Enquiry");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:");
                int ch = 1;
                switch (ch) {
                case 1:
                    System.out.println("Enter the amount to withdraw:");
                    int amount = 1000;
                    if (amount > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= amount;
                        System.out.println("Please collect the cash");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    int damount = 1000;
                    balance += damount;
                    System.out.println("Amount deposited successfully");
                    break;
                case 3:
                    System.out.println("Your balance is :" + balance);
                    break;
                case 4:
                    System.out.println("Thanks for using the ATM");
                    break;
                default:
                    System.out.println("Invalid choice");
                }
                break;
            } else {
                System.out.println("Invalid pin");
                count++;
            }
        }
    }
}
