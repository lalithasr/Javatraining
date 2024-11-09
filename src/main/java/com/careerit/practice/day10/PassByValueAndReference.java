package com.careerit.practice.day10;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;
import java.util.Scanner;

public class PassByValueAndReference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Before increment : " + num);
        increment(num);
        System.out.println("After increment : " + num);

        int[] arr = {7, 8, 9};
        System.out.println(Arrays.toString(arr));
        increment(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void increment(int[] numarr){
        for(int i=0;i<numarr.length;i++){
            numarr[i]++;
        }
        System.out.println("Inside increment method : " + Arrays.toString(numarr));
    }

    public static void increment(int num){
        num++;
        System.out.println("Inside increment method : " + num);
    }
}
