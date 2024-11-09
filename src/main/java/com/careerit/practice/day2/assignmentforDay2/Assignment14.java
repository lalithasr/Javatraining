package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Subject1 :");
        int Subject1 = sc.nextInt();
        System.out.println("Enter the Subject2 :");
        int Subject2 = sc.nextInt();
        System.out.println("Enter the Subject3 :");
        int Subject3 = sc.nextInt();
        int total = Subject1 + Subject2 + Subject3 ;
        System.out.println("Total marks : " + total);
        double percentage = total / 3;
        System.out.println("Percentage : " + percentage);
        if (percentage >= 60) {
            System.out.println("Grade A");
        } else if (percentage >= 35 && percentage < 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }
    }
}
