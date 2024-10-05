package com.careerit.cj.ArrayListExamples;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNumberss {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add to the list:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
        numList.add(num4);
        numList.add(num5);
        int[] numListArray = new int[numList.size()];
        int sum = 0;
        for (int ele : numList) {
            System.out.println("The elements in the array is: " + ele);
        }
    }
}
