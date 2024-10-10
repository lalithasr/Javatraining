package com.careerit.cj.abstractexamples;

import java.util.*;

public class AbstractExample3 {

    public static void main(String[] args) {
        T1 obj = new T2();
        List<Integer> list = obj.primeBetween(10, 20);
        int count = obj.countPrimes(10, 20);
        System.out.println(list);
        System.out.println(count);
    }
}
