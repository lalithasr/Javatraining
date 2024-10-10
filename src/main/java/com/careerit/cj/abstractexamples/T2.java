package com.careerit.cj.abstractexamples;

public class T2 extends T1 {

    @Override
    boolean isPrime(int num) {
        if (num < 2 || num % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        T2 obj = new T2();
        System.out.println(obj.isPrime(13));
        System.out.println(obj.primeBetween(10, 50));
        System.out.println(obj.countPrimes(10, 50));
    }
}
