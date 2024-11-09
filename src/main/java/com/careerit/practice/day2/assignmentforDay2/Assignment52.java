package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = sc.nextInt();
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Multiply");
        System.out.println("3. Divide");
        System.out.println("4. Modulus");
        System.out.println("5. Subtract");
        int result = sc.nextInt();
        switch (result) {
            case 1:
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            case 2:
                System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
                break;
            case 3:
                if (num2 != 0) {
                    System.out.println("The division of " + num1 + " by " + num2 + " is " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("The modulus of " + num1 + " by " + num2 + " is " + (num1 % num2));
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            case 5:
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
                break;
            default:
                System.out.println("Invalid operator. Please choose a number between 1 and 5.");
                break;
        }
    }

}
