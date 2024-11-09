package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 :");
        int num2 = sc.nextInt();
        int sub = num1 - num2;
        if(sub < 0 ) {
            sub = -sub;
            System.out.println("The difference between the numbers is : " + sub);
        }
    }
}
