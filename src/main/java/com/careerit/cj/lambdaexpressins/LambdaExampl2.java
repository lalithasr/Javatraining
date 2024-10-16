package com.careerit.cj.lambdaexpressins;

import java.util.ArrayList;

public class LambdaExampl2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.forEach((n) -> System.out.println(n));
    }
}
