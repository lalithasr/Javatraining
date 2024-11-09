package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        double sum = 0.0;
        for(int i = 1; i <= num; i++) {
            sum += (double) i/fact(i);
        }
        System.out.println("The sum of the series is "+sum);
    }

    public static int fact(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

}
