package com.careerit.cj.day3;

import java.util.Scanner;

public class BiggestNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number : ");
        int num2 = sc.nextInt();
        int big = (num1 > num2) ? num1:num2;
        System.out.println("Biggest number is : "+ big);
    }
}
