package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int number = sc.nextInt();
        int sum = 0;
        int temp =Math.abs(number);
        while (temp > 0){
            sum += temp % 10;
            temp = temp / 10;
        }
        System.out.println("The sum of digits of the number "+number+" is "+sum);
    }
}
