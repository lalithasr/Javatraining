package com.careerit.practice.day1;

import java.util.Scanner;

public class SumAndAverageofThreePersonWeights {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of person1 :");
        int p1 = sc.nextInt();
        System.out.println("Enter the weight of person2 :");
        int p2 = sc.nextInt();
        System.out.println("Enter the weight of person3 :");
        int p3 = sc.nextInt();
        int sum = p1 + p2 + p3;
        double avg = sum / 3.0;
        System.out.println("The sum of weights of 3 persons is : " + sum);
        System.out.println("The average of weights of 3 persons is : " + avg);
    }
}
