package com.careerit.cj.listsorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSortingEx1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(60);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        for(int ele:list) {
        	System.out.println(ele);
        }

    }
}
