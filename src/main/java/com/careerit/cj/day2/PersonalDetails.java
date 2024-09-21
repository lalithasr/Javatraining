package com.careerit.cj.day2;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        String name = sc.nextLine();
        System.out.println("Enter the value");
        int age = sc.nextInt();
        System.out.println("Enter the value");
        float weight = sc.nextFloat();
        System.out.println("Enter the value");
        float height = sc.nextFloat();
        System.out.println("Is working (True/False)?");
        boolean isWorking = sc.nextBoolean();
        System.out.println(" Name: " + name);
        System.out.println(" Age: " + age);
        System.out.println(" Weight: " + weight);
        System.out.println(" Height: " + height);
        System.out.println(" Is Working: " + isWorking);

    }
}
