package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the negative number to convert into positive number :");
        int num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        System.out.println("The positive number is : " + num);
    }
}
