package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int num = sc.nextInt();
        System.out.println("Enter the number of cols");
        int cols = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= cols; j++) {

                if(i == 1 || i == num ){
                    System.out.print("*");
                    continue;
                }
                if(j == cols/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
