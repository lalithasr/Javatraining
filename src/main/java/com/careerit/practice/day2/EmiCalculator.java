package com.careerit.practice.day2;
import java.util.*;

public class EmiCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate :");
        double rate = sc.nextDouble();
        System.out.println("Enter the amount :");
        double amount = sc.nextDouble();
        System.out.println("Enter the months :");
        int months = sc.nextInt();
        double emi = (amount * rate * Math.pow(1 + rate, months)) / (Math.pow(1 + rate, months) - 1);
        System.out.println("The rate entered : " + rate);
        System.out.println("The amount entered : " + amount);
        System.out.println("The months entered : " + months);
        System.out.println("The EMI calculated from the given values : " + emi);
        double totalAmount = emi * months;
        System.out.println("The total amount to be paid : " + totalAmount);

    }
}
