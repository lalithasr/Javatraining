package com.careerit.practice.day2.assignmentforDay2;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number :");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
