package com.careerit.cj.day20.abstractionexamples.BankingSystem;

public class SavingsAccount extends Account {

    private double minBalance;

    public SavingsAccount(String accNumber, String accHoldername, double balance, double minBalance) {
        super(accNumber, accHoldername, balance);
        this.minBalance = minBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " is deposited successfully");
        System.out.println("Current balance is : " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Amount " + amount + " is withdrawn successfully");
            System.out.println("Current balance is : " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Account number : " + accNumber);
        System.out.println("Account holder name : " + accHoldername);
        System.out.println("Balance : " + balance);
        System.out.println("Min balance : " + minBalance);
    }
}
