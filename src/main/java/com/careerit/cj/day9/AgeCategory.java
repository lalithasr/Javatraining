package com.careerit.cj.day9;

import java.util.Scanner;

public class AgeCategory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person : ");
        int age = sc.nextInt();
        if (age >= 1 && age <= 12) {
            System.out.println("The person is child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("The person is teenager");
        } else if (age >= 20 && age <= 35) {
            System.out.println("The person is young");
        } else if (age >= 36 && age <= 50) {
            System.out.println("The person is middle age");
        } else {
            System.out.println("The person is old");
        }
    }
}
