package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                System.out.println(num + " is prime number");
                return;
            } else {
                System.out.println(num + " is not a prime number");
                return;
            }
        }
    }
}
