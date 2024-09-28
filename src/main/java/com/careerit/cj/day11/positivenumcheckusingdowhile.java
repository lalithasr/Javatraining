package com.careerit.cj.day11;

import java.util.Scanner;

public class positivenumcheckusingdowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter the number:");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Invalid input, Please enter the positive number");
            }
        } while (num < 0);
    }
}
