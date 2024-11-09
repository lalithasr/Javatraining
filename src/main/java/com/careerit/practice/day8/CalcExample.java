package com.careerit.practice.day8;

import java.util.Scanner;

public class CalcExample {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number :");
            int a = sc.nextInt();
            System.out.println("Enter the number :");
            int b = sc.nextInt();
            System.out.println("Select the operation");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("Enter the operation :");
            int operation = sc.nextInt();
            int result = getResult(a, b, operation);
            System.out.println("The sum of " + a + " and " + b + " is " + result);
        }

        public static int getResult(int a, int b, int operation) {
            return switch (operation){
                case 1 -> a + b;
                case 2 -> a - b;
                case 3 -> a * b;
                case 4 -> a / b;
                default -> 0;
            };
        }
}
