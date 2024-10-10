package com.careerit.cj.iterator;

import java.util.*;

public class IteratorExample2 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of people: ");
        String p = sc.nextLine();
        while(!(p.equals("exit") || p.equals("Exit"))){
            name.add(p);
            p = sc.nextLine();
        }
        Iterator<String> itr = name.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        sc.close();


    }
}
