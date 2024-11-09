package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the element at index [" + i + "][" + j + "]");
                matrix[i][j] = sc.nextInt();
                System.out.println( matrix[i][j] + " ");
            }
            System.out.println();


        }
        System.out.println("Matrix is : "+ matrix);


        int sum = 0;
        int max = matrix[0][0];
        int min = matrix[0][0];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum += matrix[i][j];
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("Sum of all elements :"+sum);
        System.out.println("Max element :"+max);
        System.out.println("Min element :"+min);
    }
}
