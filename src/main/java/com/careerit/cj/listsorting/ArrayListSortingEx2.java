package com.careerit.cj.listsorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingEx2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Cat");
        list.add("Ball");
        list.add("Dog");
        list.add("Elephant");
        list.add("Fish");
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        for(String ele:list) {
        	System.out.println(ele);
        }

    }
}
