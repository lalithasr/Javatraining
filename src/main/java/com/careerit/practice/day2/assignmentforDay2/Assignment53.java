package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 :");
        int num2 = sc.nextInt();
        for(int i = 1; i <= num2; i++) {
            for(int j = 1; j <= num1; j++) {
                if(i == j){
                    continue;
                }
                System.out.print(i + " " + j);
                System.out.println();
            }

        }
    }
}
