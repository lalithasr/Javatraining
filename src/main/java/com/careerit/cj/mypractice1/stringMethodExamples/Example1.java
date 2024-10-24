package com.careerit.cj.mypractice1.stringMethodExamples;

import java.util.Scanner;

public class Example1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String word = sc.next();
        try {
            System.out.println("Enter the index :");
            int n = sc.nextInt();
            char result = word.charAt(n);
            System.out.println("The first character of the word " + word + " is " + result);
        } catch (Exception e) {
            System.out.println("Please enter a valid index");
        }


    }
}
