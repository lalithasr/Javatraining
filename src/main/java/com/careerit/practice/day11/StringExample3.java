package com.careerit.practice.day11;

import java.util.Scanner;

public class StringExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String str = sc.next();
        System.out.println("The number of vowels in the string is : " + countVowels(str));

    }
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }
}
