package com.careerit.cj.abstractexamples;
import java.util.*;

abstract class T1 {
    abstract boolean isPrime(int num);
    List<Integer> primeBetween(int lb, int ub) {
        List<Integer> list = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public int countPrimes(int lb, int ub) {
        return primeBetween(lb, ub).size();
    }

}
