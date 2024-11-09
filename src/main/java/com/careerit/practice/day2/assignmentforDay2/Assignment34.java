package com.careerit.practice.day2.assignmentforDay2;
import java.util.Scanner;

public class Assignment34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the rows in the iteration :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number of the columns in the iteration :");
        int num2 = sc.nextInt();
        System.out.println("Enter the number you want to print in the matrix");
        int actualNumber = sc.nextInt();
        for(int i = 1; i <= num1; i++) {
            for(int j = 1; j <= num2; j++) {
                if(i == j){
                    System.out.print(actualNumber + " ");
                } else {
                    System.out.print("0"+ " ");
                }

            }
            System.out.println();
        }
    }
}
