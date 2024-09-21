package com.careerit.cj.day1;

public class EmiCalculator {
    public static void main(String args[]){
        double amount = 100000;
        double rate =16;
        int months =18;
        double emi = (amount * rate / 100) / 12;
        double totalAmount = emi * months;
        System.out.println("The EMI for the amount" + amount + " for " + months);
        System.out.println("The total amount to be paid is "+ totalAmount);
        System.out.println("Emi " + emi);

    }
}
