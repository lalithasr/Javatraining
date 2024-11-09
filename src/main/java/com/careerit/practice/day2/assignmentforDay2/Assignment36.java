package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == (row / 2)+1) {
                    System.out.print("@ ");
                    continue;
                } else if (j == 1 || j == col) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
