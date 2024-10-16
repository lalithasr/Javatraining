package com.careerit.cj.mypractice1;

import java.util.*;

public class SortAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        System.out.println("Enter the integers t sort (type 'done' to finish):");
        while (sc.hasNextInt()) {
            if (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            } else {
                String str = sc.next();
                if (str.equals("exit")) {
                    break;
                } else {
                    System.out.println("Please enter a valid integer");
                }

            }
        }
        System.out.println("Enter the String t sort (type 'done' to finish):");
        while (sc.hasNext()) {
            if (sc.hasNext() && !sc.hasNext("done")) {
                stringList.add(sc.next());
            } else {
                String str = sc.next();
                if (str.equals("done")) {
                    break;
                } else {
                    System.out.println("Please enter a valid integer");
                }

            }
        }
        Collections.sort(numbers);
        System.out.println("The sorted array is : " + numbers);
        Collections.sort(stringList);
        System.out.println("The sorted array is : " + stringList);


    }
}
