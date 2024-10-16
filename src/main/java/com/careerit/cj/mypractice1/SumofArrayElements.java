package com.careerit.cj.mypractice1;

public class SumofArrayElements {

        public static void main(String[] args) {
            int[] arr = { 10, 20, 30, 40, 50 };
            int sum = 0;
            for (int ele : arr) {
                sum += ele;
            }
            System.out.println("The sum of array elements is :" + sum);
        }
}
