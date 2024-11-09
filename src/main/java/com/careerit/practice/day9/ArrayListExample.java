package com.careerit.practice.day9;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,6, 7, 9};
        int[] arr2 = {2,3,4,5,6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>();
        for(int ele:arr1){
            if(!list.contains(ele)){
                list.add(ele);
            }
        }
        for(int ele:arr2){
            if(!list.contains(ele)){
                list.add(ele);
            }
        }
        System.out.println(list);
        int[] uarr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            uarr[i] = list.get(i);
        }
        System.out.println(isPresent(uarr, 10));
    }

    private static boolean isPresent(int[] uarr, int ele){
        for(int el:uarr) {
            if (el == ele) {
                return true;
            }
        }
        return false;

    }
}
