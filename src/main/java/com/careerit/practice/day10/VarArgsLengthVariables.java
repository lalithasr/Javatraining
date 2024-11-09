package com.careerit.practice.day10;

import java.util.Scanner;

public class VarArgsLengthVariables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the number 3 : ");
        int num3 = sc.nextInt();
        System.out.println("Enter the number 4 : ");
        int num4 = sc.nextInt();
        System.out.println("Enter the number 5 : ");
        int num5 = sc.nextInt();
        System.out.println("Enter the number 6 : ");
        int num6 = sc.nextInt();

            System.out.println(add(num1, num2));
            System.out.println(add(num1, num2, num3));
            System.out.println(add(num1, num2, num3, num4));

            System.out.println(add(num1, num2, num3, num4, num5));
            System.out.println(add(num1, num2, num3, num4, num5, num6));

            String res = getResult(",", num1, num2, num3, num4, num5, num6);
            System.out.println(res);
        }

        public static int add(int a, int b) {
            return a + b;
        }

        public static int add(int a, int b, int c) {
            return a + b + c;
        }

        public static int add(int a, int b, int c, int d) {
            return a + b + c + d;
        }

        public static int add(int... arr) {
            int sum = 0;
            for (int ele : arr) {
                sum += ele;
            }
            return sum;
        }

        public static String getResult(String sep, int... arr) {

            String res = "";

            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1) {
                    res += arr[i] + sep;
                } else {
                    res += arr[i];
                }
            }
            return res;
        }
    }