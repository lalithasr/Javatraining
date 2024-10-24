package com.careerit.cj.mypractice1;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle :");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("The area of the rectangle is : " + area);
    }
}
