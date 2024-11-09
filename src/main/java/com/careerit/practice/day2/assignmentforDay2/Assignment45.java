package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int singleDigitsum = getSingleDigitSum(num);
        System.out.println("The sum of the digits of the number " + num + " is " + singleDigitsum);
    }

    public static int getSingleDigitSum(int num) {
        while (num >= 10) {
           int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        num = sum;
    }
    return num;
    }
}
