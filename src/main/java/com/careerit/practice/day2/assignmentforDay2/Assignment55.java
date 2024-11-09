package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unicode number of the symbol :");
        char image = (char) sc.nextInt();
        System.out.println("Enter the number of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int cols = sc.nextInt();
        char smiley = '\u263A';

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                System.out.print(image + " : " + smiley + " ");
            }
            System.out.println();

        }
    }
}
