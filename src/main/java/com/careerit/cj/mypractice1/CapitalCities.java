package com.careerit.cj.mypractice1;

import java.util.HashMap;
import java.util.Scanner;

public class CapitalCities {

        public static void main(String[] args) {
            HashMap<Integer, String> capitalCities = new HashMap<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of countries :");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println("You can only enter " + n + " countries");
            for(int i = 0; i < n; i++) {
                System.out.println("Enter the country ID:");
                int countryID = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the country name :");
                String country = sc.nextLine();
                capitalCities.put(countryID, country);
            }
            sc.close();
            System.out.println("The countries you entered are :" + capitalCities);
        }
}
