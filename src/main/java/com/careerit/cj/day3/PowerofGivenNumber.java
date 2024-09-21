package com.careerit.cj.day3;

import java.util.Scanner;

public class PowerofGivenNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number m : ");
        int m = sc.nextInt();
        System.out.println("Enter the number n : ");
        int n = sc.nextInt();
        double res = Math.pow(m,n);
        System.out.println(m + "power of " + n + "is : " + res);
    }
}
