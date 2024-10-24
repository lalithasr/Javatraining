package com.careerit.cj.mypractice1;

import java.util.Scanner;

public class Squareroot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        double num = sc.nextDouble();
        double res = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " + res);
    }
}
