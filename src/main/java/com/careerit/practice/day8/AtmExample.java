package com.careerit.practice.day8;
import java.util.Scanner;

public class AtmExample {

    public static void withdraw() {
        System.out.println("Please enter the amount to withdraw");
        System.out.println("Please collect the cash");
    }
    public static void deposit() {
        System.out.println("Please enter the amount to deposit");
        System.out.println("Please insert the cash");
    }

    public static void balanceEnquiry() {
        System.out.println("Your balance is : 10000");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.println("Please enter the card");
        System.out.println("Please enter the pin");
        System.out.println("Please select the option");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance Enquiry");
        System.out.println("4. Change Pin");
        System.out.println("5. Exit");
        System.out.println("Please enter the option");
        System.out.println("Thank you for using ATM");
        int selectedOption = sc.nextInt();
        if(selectedOption == 1) {
            withdraw();
        } else if(selectedOption == 2) {
            deposit();
        } else if(selectedOption == 3) {
            balanceEnquiry();
        } else if(selectedOption == 4) {
            System.out.println("Please enter the new pin");
            System.out.println("Please re-enter the new pin");
            System.out.println("Pin changed successfully");
        } else if(selectedOption == 5) {
            System.out.println("Please collect the card");
            System.out.println("Thank you for using ATM");
        } else {
            System.out.println("Invalid option");
        }
    }
}
