package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter the number where you want to start :");
        int start = sc.nextInt();
        for(int i = row; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
}
