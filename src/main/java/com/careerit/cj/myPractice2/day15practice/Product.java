package com.careerit.cj.myPractice2.day15practice;

import java.util.List;

public class Product {
    int pid;
    String name;
    double price;

    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
    }

    public static List<Product> loadProducts() {
        Product p1 = new Product(1001, "Dell Laptop", 45000);
        Product p2 = new Product(1002, "HP Laptop", 35000);
        Product p3 = new Product(1003, "Macbook Pro", 145000);
        Product p4 = new Product(1004, "Lenovo Laptop", 25000);
        return List.of(p1, p2, p3, p4);
    }
    public static void main(String[] args) {

        List<Product> products = loadProducts();
        for (Product product : products) {
            System.out.println(product);
        }

    }


}


