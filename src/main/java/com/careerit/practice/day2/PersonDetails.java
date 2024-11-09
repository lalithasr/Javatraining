package com.careerit.practice.day2;
import java.util.*;
public class PersonDetails {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name :");
       String name = sc.nextLine();
       System.out.println("Enter the age :");
       int age = sc.nextInt();
       System.out.println("Enter the city :");
       String city = sc.next();
       System.out.println("Enter the state :");
       String state = sc.next();
       System.out.println("Enter the country :");
       String country = sc.next();
       System.out.println("Name of the person : " + name + "\nAge of the person : " + age + "\nCity of the person : " + city + "\nState of the person : " + state + "\nCountry of the person : " + country);

    }
}
