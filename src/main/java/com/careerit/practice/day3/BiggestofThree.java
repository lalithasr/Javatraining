package com.careerit.practice.day3;

import java.util.Scanner;

public class BiggestofThree {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number1 :");
            int num1 = sc.nextInt();
            System.out.println("Enter the number2 :");
            int num2 = sc.nextInt();
            System.out.println("Enter the number3 :");
            int num3 = sc.nextInt();
            if(num1 > num2 && num1 > num3) {
                System.out.println("The biggest number is "+num1);
            }else if(num2 > num3) {
                System.out.println("The biggest number is "+num2);
            }else {
                System.out.println("The biggest number is "+num3);
            }
        }
}
