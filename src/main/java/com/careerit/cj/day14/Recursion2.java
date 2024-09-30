package com.careerit.cj.day14;

import java.util.Scanner;

public class Recursion2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number :");
            int num = sc.nextInt();
            int res = sum(num);
            System.out.println("The sum of first " + num + " natural numbers is " + res);
        }

        public static int sum(int num) {
            if (num == 1) {
                return 1;
            }
            return num + sum(num - 1);
        }
}
