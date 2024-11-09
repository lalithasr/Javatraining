package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int reverse = 0;
        int temp = Math.abs(number);
        if(temp == 0) {
            reverse = 0;
        } else {
            while(temp > 0) {
                reverse = reverse * 10 + temp % 10;
                temp = temp / 10;
            }
        }
        System.out.println("The reverse of the number "+number+" is "+reverse);
    }
}
