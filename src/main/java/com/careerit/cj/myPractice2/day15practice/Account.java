package com.careerit.cj.myPractice2.day15practice;

public class Account {
    private String accNumber;
    private String name;
    private double balance;
    private String ssn;
    private String mobile;

    public Account(String accNumber, String name, double balance, String ssn, String mobile) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
        this.ssn = ssn;
        this.mobile = mobile;
    }
    public void showInfo(){
        System.out.println("Account Number :"+accNumber);
        System.out.println("Name :"+name);
        System.out.println("Balance :"+balance);
        System.out.println("SSN :"+ssn);
        System.out.println("Mobile :"+mobile);
    }

    public static void main(String[] args) {
        Account acc1 = new Account("SB1001", "Krish", 10000, "ABCD1234", "9876543210");
        acc1.showInfo();
    }
}
