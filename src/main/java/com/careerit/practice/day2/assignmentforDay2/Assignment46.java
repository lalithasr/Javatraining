package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int num = sc.nextInt();
        int count = 0;
        int temp = Math.abs(num);
        while (temp > 0) {
            int digit = temp % 10;
            if(isPrime(digit)) {
                count++;
            }
            temp = temp / 10;
        }


        System.out.println("The number of prime digits in the number "+num+" is "+count);
            }
    public static boolean isPrime(int digit) {
        return digit == 2 || digit == 3 || digit == 5 || digit == 7;
        }
    }


