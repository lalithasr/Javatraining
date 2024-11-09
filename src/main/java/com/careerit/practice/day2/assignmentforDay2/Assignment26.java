package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int rowNumber = sc.nextInt();
        System.out.println("Enter the number where you want to start :");
        int actualNumber = sc.nextInt();
        for(int i = 1; i <= rowNumber; i++) {
            for(int j = 1; j <= rowNumber; j++) {
                System.out.print(actualNumber + " ");
                actualNumber++;
            }
            System.out.println();
        }
    }
}
