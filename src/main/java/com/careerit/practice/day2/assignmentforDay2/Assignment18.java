package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting lower and upper bound values
        System.out.print("Enter the lower bound value: ");
        int lowBound = scanner.nextInt();
        System.out.print("Enter the upper bound value: ");
        int highBound = scanner.nextInt();

        // Displaying the result
        System.out.print("The prime numbers between " + lowBound + " and " + highBound + " are: ");
        for (int i = lowBound; i <= highBound; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // If divisible by any number other than 1 and itself
            }
        }
        return true;  // If no divisors found, it's a prime number
    }
}