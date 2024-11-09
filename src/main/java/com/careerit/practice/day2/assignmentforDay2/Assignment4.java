package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment4 {

    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping num1 : "+num1+" num2 : "+num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 :");
        int num2 = sc.nextInt();
        System.out.println("Before swapping num1 : "+num1+" num2 : "+num2);
        swap(num1, num2);

    }
}
