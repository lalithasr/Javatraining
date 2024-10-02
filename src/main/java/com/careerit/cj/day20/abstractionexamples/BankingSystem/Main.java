package com.careerit.cj.day20.abstractionexamples.BankingSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number:");
        String accno = sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the balance:");
        double balance = sc.nextDouble();
        System.out.println("Enter the min balance:");
        double minBalance = sc.nextDouble();
        SavingsAccount account = new SavingsAccount(accno, name, balance, minBalance);
        account.deposit(5000);
        account.withdraw(2000);
        account.checkBalance();
    }
}
