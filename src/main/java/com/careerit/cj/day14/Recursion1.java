package com.careerit.cj.day14;

import java.util.Scanner;

public class Recursion1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int res = fact(num);
        System.out.println("The factorial of " + num + " is " + res);
    }

    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fact(num - 1);
    }
}
