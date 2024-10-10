package com.careerit.cj.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraorExample1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(100);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println("Elements in the list are: " + itr.next());
        }
    }
}
