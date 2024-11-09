package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int num2 = sc.nextInt();
        for(int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                if(i == (num1/2)+1 || j == (num2/2)+1){
                    System.out.print("* ");
                } else if(i == 1 && j<=(num2/2)+1){
                    System.out.print("* ");
                } else if (i == num1 && j >=(num2/2)+1){
                    System.out.print("* ");
                }else if(j == 1 && i>=(num2/2)+1){
                    System.out.print("* ");
                } else if (j == num1 && i <=(num2/2)+1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
