package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        for (int i = num; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
