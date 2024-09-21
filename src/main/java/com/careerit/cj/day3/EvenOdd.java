package com.careerit.cj.day3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Select the different number apart from 0");
        } else if (num % 2 == 0 ){
            System.out.println("Even number");
        } else{
            System.out.println("Odd Number");
        }
    }
}
