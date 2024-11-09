package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int number = 1;
        for(int i = 1; i <= num; i++) {
           for(int j = 1; j <= Math.pow(2,i-1); j++) {
               System.out.print(number + " ");
               number++;
           }
              System.out.println();
        }
    }
}
