package com.careerit.cj.mypractice1;

import java.util.Scanner;

public class ConvertingStrtoArr {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string :");
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            for (char c : ch) {
                System.out.println(c);
            }
        }
}
