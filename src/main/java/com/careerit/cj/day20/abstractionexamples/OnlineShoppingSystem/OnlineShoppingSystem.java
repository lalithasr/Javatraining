package com.careerit.cj.day20.abstractionexamples.OnlineShoppingSystem;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id:");
        String pid = sc.nextLine();
        System.out.println("Enter the product name:");
        String name = sc.nextLine();
        System.out.println("Enter the price:");
        double price = sc.nextDouble();
        System.out.println("Enter the discount:");
        int discount = sc.nextInt();
        System.out.println("Enter the rating:");
        int rating = sc.nextInt();
        System.out.println("Enter the brand:");
        String brand = sc.next();
        System.out.println("Enter the model:");
        String model = sc.next();
        Product product = new Electronics(pid, name, price, discount, rating, brand, model);
        System.out.println(product.getDiscountedPrice(price, discount));
    }
}
