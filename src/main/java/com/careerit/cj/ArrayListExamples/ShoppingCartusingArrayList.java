package com.careerit.cj.ArrayListExamples;



import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartusingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        System.out.println("Enter the number of items you want to add to the cart:(type 'done' to finish adding items)");
        while (true) {
            System.out.println("Enter the item:");
            String item = sc.nextLine();
            if (item.equalsIgnoreCase("done")) {
                break;
            }
            shoppingList.add(item);
        }
        System.out.println("\n Your Shopping Cart contains the following items:");
        for (String listItem : shoppingList) {
            System.out.println(listItem);
        }
        System.out.println("\n Enter the item you want to check from the cart:(type 'done' to finish checking items)");
        String checkItem = sc.nextLine();
        if(shoppingList.contains(checkItem)){
            System.out.println(checkItem + " is present in the cart");
        }
        else{
            System.out.println(checkItem + " item is not present in the cart");
        }

        System.out.println("Enter the item you want to remove from the cart:");
        String removeItem = sc.nextLine();
        if(shoppingList.contains(removeItem)){
            shoppingList.remove(removeItem);
            System.out.println(removeItem + " is removed from the cart");
        }
        else{
            System.out.println(removeItem + " item is not present in the cart");
        }
        System.out.println("\n Your Shopping Cart contains the following items:");
        for (String listItem : shoppingList) {
            System.out.println(listItem);
        }
        sc.close();
    }
}
