package com.careerit.practice.day10;

import java.util.*;

public class NumberExampleUsingList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        List<Integer> list = getPrimes(n);
        System.out.println(list);
    }
    public static List<Integer> getPrimes(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=2;;i++){
            if(isPrime(i)){
                list.add(i);
            }
            if(list.size() == n){
                break;
            }
        }
        return list;
    }
    public static boolean isPrime(int num){

        if(num == 2){
            return true;
        }
        if(num < 2 || num % 2 == 0){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
