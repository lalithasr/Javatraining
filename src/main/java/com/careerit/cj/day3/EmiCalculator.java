package com.careerit.cj.day3;

import java.util.Scanner;

public class EmiCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int p = sc.nextInt();
        System.out.println("Enter the value");
        double r = sc.nextDouble();
        System.out.println("Enter the value");
        int n = sc.nextInt();
        r = r/100/12;
        double emi = p * r  * (Math.pow(1, r+1)/(Math.pow(1+r, n) - 1));
        double totalAmount = emi * n;
        double totalInterest = totalAmount - p;
        System.out.println("EMI : "+ emi);
        System.out.println("Total Amount is : " + totalAmount);
        System.out.println("Total Interest is : " + totalAmount);


    }
}
