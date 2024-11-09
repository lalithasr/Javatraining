package com.careerit.practice.day7;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int res = Math.abs(num);
        int sum = 0;
        while (res != 0) {
            int r = res % 10;
            sum += r;
            res = res / 10;
        }
        System.out.println("The sum of digits is :" + sum);
    }
}
