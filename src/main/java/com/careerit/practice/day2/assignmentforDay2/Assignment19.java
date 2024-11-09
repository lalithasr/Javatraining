package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int upperbound = sc.nextInt();
        System.out.println("Fibonacci series upto " + upperbound + " is :");
        int num1 = 0, num2 = 1;
        System.out.print(num1 + " " );
        System.out.print(num2 + " ");
        for(int next = num1 + num2; next <= upperbound; next = num1 + num2) {
            System.out.print(next + " ");
            num1 = num2;
            num2 = next;
        }
    }
}
