package com.careerit.cj.day16;

import java.util.Scanner;

public class Bankaccount {

    private String accNumber;
    private String name;
    private double balance;

    public Bankaccount(String accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance should be greater than 0");
            this.balance = 0;
        }

    }
    public String getAccNumber() {
        return accNumber;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        if(balance > 0) {
            this.balance = balance;
        }else {
            System.out.println("Balance should be greater than 0");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully, new balance is :"+balance);
        }else {
            System.out.println("Amount should be greater than 0");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully, new balance is :"+balance);
        }else {
            System.out.println("Amount should be greater than 0 and less than or equal to balance");
        }
    }

    public void display() {
        System.out.println("Account number : "+accNumber);
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number:");
        String accNumber = sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the balance:");
        double balance = sc.nextDouble();
        System.out.println("Enter the amount to deposit:");
        double amount = sc.nextInt();
        Bankaccount b1 = new Bankaccount(accNumber, name, balance);
        b1.display();
        b1.deposit(amount);
        b1.withdraw(amount);
        b1.display();
    }


}