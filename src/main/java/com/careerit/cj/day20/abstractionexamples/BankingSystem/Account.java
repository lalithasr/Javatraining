package com.careerit.cj.day20.abstractionexamples.BankingSystem;

abstract class Account {

    protected String accNumber;
    protected String accHoldername;
    protected double balance;

    public Account(String accNumber, String accHoldername, double balance) {
        this.accNumber = accNumber;
        this.accHoldername = accHoldername;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void checkBalance();


}
