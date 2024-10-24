package com.careerit.cj.mypractice1;

import java.util.*;
import java.util.Scanner;
//Calculate the average of the elements in the array where age should be between 1 and 99
public class FindAvg {
    public static void main(String[] args) throws NullPointerException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array :");
        int ages = sc.nextInt();
        List<Integer> array = new ArrayList<>();

        while(array != null && ages > 0 && ages < 100) {

            array.add(ages);
            ages = sc.nextInt();

        }
        sc.close();
        System.out.println("Please enter the elements of the array :" + array);
        float avg, sum = 0;
        for(int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        System.out.println("The sum of the array is :" + sum);
        avg = sum / array.size();
        System.out.println("The average of the array is :" + avg);

    }
}
