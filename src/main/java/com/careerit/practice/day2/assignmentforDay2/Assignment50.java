package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m number :");
        int m = sc.nextInt();
        System.out.println("Enter the n number :");
        int n = sc.nextInt();
        double result = Math.pow(m, n);
        System.out.println("result of " + m +  " power of "+ n + " is " + result);
    }
}
