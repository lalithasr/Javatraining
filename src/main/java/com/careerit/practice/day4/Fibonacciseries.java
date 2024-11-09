package com.careerit.practice.day4;

import java.util.Scanner;

public class Fibonacciseries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int loop = sc.nextInt();
        System.out.println("Enter the initial number :");
        int initial = sc.nextInt();
        System.out.println("Enter the current number :");
        int current = sc.nextInt();
        System.out.print("Enter the number :" + initial + " " + current + " ");
        for(int i = 1; i <= loop; i++) {
            int next = initial + current;
            System.out.print(next+" ");
            initial = current;
            current = next;
        }

    }
}
