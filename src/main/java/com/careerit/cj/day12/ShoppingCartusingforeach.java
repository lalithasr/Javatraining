package com.careerit.cj.day12;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartusingforeach {

        public static void main(String[] args) {
            List<String> products = new ArrayList<>();
            products.add("Apple");
            products.add("Laptop");
            products.add("Mobile");
            products.add("Book");
            products.add("Pen");
            System.out.println("The products in the cart are : ");
            for (String product : products) {
                System.out.println(product);
            }

        }
}
