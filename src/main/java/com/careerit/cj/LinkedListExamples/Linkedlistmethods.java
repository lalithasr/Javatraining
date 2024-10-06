package com.careerit.cj.LinkedListExamples;
import java.util.*;

public class Linkedlistmethods {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list1);
        System.out.println(list2);
        result.add(list1.get(0) + list2.get(0));
        result.add(list1.get(1) + list2.get(1));
        result.add(list1.get(2) + list2.get(2));
        System.out.println(result);
        list1.addFirst(9);
        list1.addLast(11);
        System.out.println(list1);
        list2.addFirst(2);
        list2.addLast(4);
        System.out.println(list2);
        list1.getFirst();
        list1.getLast();
        list2.getFirst();
        list2.getLast();
        System.out.println(list1);
        System.out.println(list2);
        list1.removeFirst();
        System.out.println(list1);
        list1.removeLast();
        System.out.println(list1);
        list2.removeFirst();
        System.out.println(list2);
        list2.removeLast();
        System.out.println(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
