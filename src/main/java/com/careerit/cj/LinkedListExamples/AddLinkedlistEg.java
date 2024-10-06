package com.careerit.cj.LinkedListExamples;


import java.util.LinkedList;

public class AddLinkedlistEg {


    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list1);
        System.out.println(list2);
        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i).length() + list2.get(i));
        }
        System.out.println(result);
    }
}