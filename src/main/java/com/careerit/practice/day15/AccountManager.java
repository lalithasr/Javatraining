package com.careerit.practice.day15;

class Account{
    private String accNumber;
    private String name;
    private String ssn;
    private String mobile;
    private double balance;
    public Account(String accNumber, String name, String ssn, String mobile, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.ssn = ssn;
        this.mobile = mobile;
        this.balance = balance;
    }
    public void showDetails(){
        System.out.println("Account Number : "+accNumber);
        System.out.println("Name : "+name);
        System.out.println("SSN : "+ssn);
        System.out.println("Mobile : "+mobile);
        System.out.println("Balance : "+balance);
        System.out.println("-------------------------------");
    }
}
public class AccountManager {

    public static void main(String[] args) {
        Account account1 = new Account("1001", "Krish", "123456789", "9876543210", 10000);
        Account account2 = new Account("1002", "Manoj", "123456789", "9876543210", 20000);
        account1.showDetails();
        account2.showDetails();
    }
}
