package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int count = 0;
        int temp = Math.abs(num);
        if(temp == 0) {
            count = 1;
        } else {
            while(temp != 0) {
                temp = temp / 10;
                count++;
            }
        }
        System.out.println("The number of digits in the number " + num + " is " + count);
    }
}
