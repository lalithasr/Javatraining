package com.careerit.practice.day1;
import java.util.*;
public class ASumAndAvgOfAgesOfThreePersonsDay1Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of first person :");
        int age1 = sc.nextInt();
        System.out.println("Enter the age of second person :");
        int age2 = sc.nextInt();
        System.out.println("Enter the age of third person :");
        int age3 = sc.nextInt();
        int sum = age1 + age2 + age3;
        double avg = sum / 3.0;
        System.out.println("The sum of ages of three persons is : " + sum);
        System.out.println("The average of ages of three persons is : " + avg);
    }
}
