package com.careerit.cj.mypractice1.stringMethodExamples;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String word = sc.next();
        try {
            System.out.println("Enter the index :");
            int n = sc.nextInt();
            int result = word.codePointAt(n);
            System.out.println("The ASCII value of the first character of the word " + word + " is " + result);
            int result1 = word.codePointBefore(n);
            System.out.println("The ASCII value of the character before the first character of the word " + word + " is " + result1);
            int result2 = word.codePointCount(0, n);
            System.out.println("The number of characters in the word " + word + " is " + result2);
        }
        catch (Exception e) {
            System.out.println("Please enter a valid index");
        }
    }
}
