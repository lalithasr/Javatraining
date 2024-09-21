package com.careerit.cj.day3;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int score = sc.nextInt();
        String grade = "Invalid Grade";
        if (score >= 80 && score <= 100) {
            grade = "A";
        } else if (score >= 60 && score <= 80) {
            grade = "B";
        } else if (score >= 50 && score <= 60) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        System.out.println("Score : " + score + " grade updated :" + grade);
    }
}
