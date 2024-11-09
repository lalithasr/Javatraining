package com.careerit.practice.day6;

import java.util.Scanner;

public class FactorsOfGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(num == 1 || num == 0) {
            System.out.println("The number "+num+" has 1 factor");
            return;
        }
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        System.out.println("The number "+num+" has "+count+" factors");
    }
}
