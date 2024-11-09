package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment47 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Please enter a positive number");
            return;
        }
        if(num == 0) {
            System.out.println("The sum of the digits of the number 0 is 0");
            return;
        }
        if(num > 0){
            int fact = 1;
            while(num > 0) {
                fact = fact * num;
                num--;
            }
            System.out.println("The factorial of the number is "+fact);
        }

    }
}
