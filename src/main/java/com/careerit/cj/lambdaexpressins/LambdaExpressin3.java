package com.careerit.cj.lambdaexpressins;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressin3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Consumer<Integer> consumer = (n) -> System.out.println(n);
        list.forEach(consumer);
    }
}
