package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int num = sc.nextInt();
        System.out.println("Enter the actual number where to start :");
        int start = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                start--;
            }
            System.out.println();
        }
    }
}