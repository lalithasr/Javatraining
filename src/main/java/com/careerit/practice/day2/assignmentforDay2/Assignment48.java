package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num < 1000 || num > 9999) {
            System.out.println("Please enter a 4 digit number");
            return;
        } else {
            int placeValue = 1000;
            int temp = num;
            while(placeValue >= 1) {
                int digit = temp / placeValue;
                System.out.println(digit + " * " + placeValue + " = " + (digit * placeValue));
                temp = temp % placeValue;
                placeValue = placeValue / 10;
            }
        }
    }
}
