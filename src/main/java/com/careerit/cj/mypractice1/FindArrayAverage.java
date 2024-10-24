package com.careerit.cj.mypractice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        sc.nextLine();
        List<Integer> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        System.out.println("Enter the integers :");
        for(int i = 0; i < size; i++) {
           int num = sc.nextInt();
              array1.add(num);
        }
        sc.nextLine();
        System.out.println("Enter the strings :");
        for(int i = 0; i < size; i++) {
           String str = sc.nextLine();
              array2.add(str);
        }
        System.out.println("The integers entered in the array are : " + array1);
        for(int num : array1) {
           System.out.println(num);
        }
        System.out.println("The strings entered in the array are : " + array2);
        for(String str : array2) {
           System.out.println(str);
        }
        sc.close();
    }
}
