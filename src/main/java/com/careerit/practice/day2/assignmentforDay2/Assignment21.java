package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }

