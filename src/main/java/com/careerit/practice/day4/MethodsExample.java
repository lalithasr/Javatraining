package com.careerit.practice.day4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MethodsExample {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("Enter the year");
        int year = sc.nextInt();
        System.out.println(isEven(num));
        System.out.println(isLeapYear(year));
        System.out.println(getLocalDateTime());
    }
}
