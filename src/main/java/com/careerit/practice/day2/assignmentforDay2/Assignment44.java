package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;
import java.lang.Math;

public class Assignment44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(isArmstrong(num)) {
            System.out.println(num + " is an armstrong number");
        } else {
            System.out.println(num + " is not an armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp = temp / 10;
        }
        return sum == num;
    }
}
