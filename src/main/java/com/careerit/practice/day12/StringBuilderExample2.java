package com.careerit.practice.day12;

import java.util.Scanner;

public class StringBuilderExample2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.next();
        System.out.println(isPalindrome(str) ? "Entered name " + str + " Palindrome" : "Entered name " + str + " Not a palindrome");


    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
