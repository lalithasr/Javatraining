package com.careerit.cj.hashset;


import java.util.*;

public class HashSetExample2 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> people = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter exit to stop adding the people");
        System.out.println("Enter the name of people: ");
        String name = sc.nextLine();
                while(!(name.equals("exit") || name.equals("Exit"))){
            people.add(name);
            name = sc.nextLine();
        }
        sc.close();
        System.out.println("People added in the company: " + people);
        System.out.println("Total there are "+people.size() + " people in the company");
        if(people.isEmpty()){
            System.out.println("There are no people in the HashSet");
        } else {
            System.out.println("There are different people in the company : "+ people);
        }

        Iterator<String> itr = people.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        people.clear();

        name = sc.nextLine();
        while(!(name.equals("exit") || name.equals("Exit"))){
            people.add(name);
            name = sc.nextLine();
        }
        sc.close();
        System.out.println("People added in the company: " + people);
        System.out.println("Total there are "+people.size() + " people in the company");
        if(people.isEmpty()){
            System.out.println("There are no people in the HashSet");
        } else {
            System.out.println("People working in the company : "+ people);
        }



    }
}

