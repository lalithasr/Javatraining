package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        double sum = 0.0;
        for(int i = 1; i <= num; i++) {
           sum += 1/(i*i*i);
            }
        System.out.println("Sum of series is : " + sum);
        }
    }
