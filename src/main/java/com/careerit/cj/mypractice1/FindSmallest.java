package com.careerit.cj.mypractice1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FindSmallest {

            public static void main(String[] args) throws InputMismatchException {
                Scanner sc = new Scanner(System.in);
                List<Integer> array = new ArrayList<>();
                System.out.println("Enter the elements of the array :");
                int n = sc.nextInt();
                System.out.println("Your array ends at :" + n);
                System.out.println("Enter the elements of the array :");
                for (int i = 0; i < n; i++) {
                    int num = sc.nextInt();
                    array.add(num);
                    System.out.println("The element in the array is :" + array);

                }
                sc.close();
                for(int i = 0; i < array.size(); i++) {
                    int min = array.get(0);
                    if(array.get(i) < min) {
                        min = array.get(i);
                    }
                    System.out.println("The smallest element in the array is :" + min);
                }
            }

}
