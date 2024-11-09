package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number of col :");
        int num2 = sc.nextInt();
        System.out.println("Enter the start number :");
        int start = sc.nextInt();
        System.out.println("Enter the increment number :");
        int increment = sc.nextInt();

        for(int i = 1; i <= num1; i++) {
            for(int j = 1; j <= num2; j++) {
                System.out.print(start + " ");
                start += increment;

            }
            System.out.println();
        }
    }
}
