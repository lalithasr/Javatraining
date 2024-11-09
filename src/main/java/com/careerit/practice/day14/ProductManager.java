package com.careerit.practice.day14;

public class ProductManager {

    public static void main(String[] args) {
        Product product1 = new Product(1001, "Laptop", 45000);
        Product product2 = new Product(1002, "Mobile", 25000);
        Product product3 = new Product(1003, "Tablet", 15000);
        Product product4 = new Product(1004, "Desktop", 35000);
        Product product5 = new Product(1005, "Smart Watch", 5000);
        System.out.println(product1.hashCode());
        System.out.println(product1.getClass().getName());
        System.out.println(product1.toString());

        Product[] products = { product1, product2, product3, product4, product5 };

        for (Product product : products) {
            System.out.println(product);
        }

    }
}
