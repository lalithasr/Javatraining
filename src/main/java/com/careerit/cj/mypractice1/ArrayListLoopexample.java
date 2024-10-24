package com.careerit.cj.mypractice1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLoopexample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words you want to add :");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the word :");
            String word = sc.next();
            list.add(word);
        }
        System.out.println("The words you entered are :" + list);
        sc.close();

    }
}
