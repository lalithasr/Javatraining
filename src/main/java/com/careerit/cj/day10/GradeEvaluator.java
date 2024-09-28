package com.careerit.cj.day10;

import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade of the student:");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade, Please enter grade between A-F");
                break;
        }
    }
}
