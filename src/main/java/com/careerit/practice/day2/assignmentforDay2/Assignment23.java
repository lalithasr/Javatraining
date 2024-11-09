package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            if(!(i % 2 == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}
