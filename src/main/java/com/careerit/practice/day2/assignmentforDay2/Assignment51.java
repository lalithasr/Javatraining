package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sc.next().toLowerCase().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                if((ch >= 'a' && ch <= 'z')){
                    System.out.println(ch + " is consonant");
                } else {
                    System.out.println(ch + " is not a alphabet");
                }
                break;
        }

    }
}
