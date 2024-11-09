package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment49 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number :");
       int num = sc.nextInt();
       if(num < 10000 || num > 99999) {
           System.out.println("Please enter a 5 digit number");
                } else {
           int incrementedNum = 0;
           int placeValue = 1;
           while (num > 0) {
               int digit = num % 10;
               digit = (digit + 1) % 10;
               incrementedNum = digit * placeValue + incrementedNum;
               num = num / 10;
               placeValue = placeValue * 10;
           }
              System.out.println("The incremented number is " + incrementedNum);
       }
    }
}
