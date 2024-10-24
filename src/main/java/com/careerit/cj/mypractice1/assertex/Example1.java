package com.careerit.cj.mypractice1.assertex;

import java.util.Scanner;

public class Example1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number :");
            int num = sc.nextInt();
            assert num > 10 : "The number should be greater than 10";
            System.out.println("The number is : " + num);
        }
}
