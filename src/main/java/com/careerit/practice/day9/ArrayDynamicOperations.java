package com.careerit.practice.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Darray{
    int[] arr = new int[5];
    int index = 0;
    public void add(int ele) {
        if(index == arr.length) {
            int[] temp = new int[arr.length * 2];
            for(int i=0;i<arr.length;i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[index++] = ele;
    }

    public void showElements() {
        if(index == 0) {
            System.out.println("No elements to show");
            return;
        } else {
            int[] temp = new int[index];
            System.arraycopy(arr,0, temp, 0, index);
            System.out.println(Arrays.toString(temp));
        }
    }
}

public class ArrayDynamicOperations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list.size());
        list.add(40);
        list.add(1,100);
        System.out.println(list);
        System.out.println(list.contains(10));
        if(list.contains(10)) {
            int index = list.indexOf(10);
            list.add(index, 1000);
        }
        System.out.println(list);
        for(int ele : list) {
            System.out.println(ele);
        }
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        list.forEach(System.out::println);
    }
}
