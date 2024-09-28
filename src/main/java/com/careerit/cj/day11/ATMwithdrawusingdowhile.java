package com.careerit.cj.day11;

import java.util.Scanner;

public class ATMwithdrawusingdowhile {
    public static void main(String[] args){
        System.out.println("Welcome to ATM, Please enter any key to continue");
        Scanner sc = new Scanner(System.in);
        int amount = 10000000;
        System.out.println("Enter the pin which you want to choose:");
        int correctPin = sc.nextInt();
        System.out.println("Enter how many attempts you need to try:");
        int attempts = sc.nextInt();
        System.out.println("Enter the pin to display the menu:");
        int enteredPin = sc.nextInt();
        while(enteredPin != correctPin && attempts > 1) {
            attempts--;
            System.out.println("Enter the correct pin you have " + attempts + " attempts left");
            enteredPin = sc.nextInt();
        }
        if(enteredPin == correctPin) {
            System.out.println("select from the below options:");
            System.out.println("Enter any key to continue");
            int choice = sc.nextInt();
            do {
                System.out.println("\nWelcome to the ATM");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:");
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("\nYour balance is : "+ amount);
                        break;
                    case 2:
                        System.out.println("\nEnter the amount you want to deposit:");
                        int depositamount = sc.nextInt();
                        System.out.println("\nYou have deposited : "+ depositamount + " successfully");
                        amount += depositamount;
                        break;
                    case 3:
                        System.out.println("\nEnter the amount you want to withdraw:");
                        int withdrawamount = sc.nextInt();
                        System.out.println("\nAmount "+withdrawamount+" is withdrawn successfully");
                        amount -= withdrawamount;
                        break;
                    case 4:
                        System.out.println("\nThanks for using the ATM");
                        break;
                    default:
                        System.out.println("\nInvalid choice, please try selecting the correct choice from 1 to 4");
                }
            } while(choice != 4);
        } else {
            System.out.println("\nInvalid pin no attempts left, your card is blocked, please contact the bank");
        }

        sc.close();
    }
}
