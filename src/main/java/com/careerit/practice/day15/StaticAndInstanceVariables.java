package com.careerit.practice.day15;

import java.util.List;

class Product{
    int pid;
    String pname;
    double price;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
    }
}
public class StaticAndInstanceVariables {

        public static void main(String[] args) {
            List<Product> products = loadProducts();
            for(Product product:products){
                System.out.println(product);
            }
        }

        private static List<Product> loadProducts(){
            Product p1 = new Product(1001, "Laptop", 45000);
            Product p2 = new Product(1002, "Mobile", 25000);
            Product p3 = new Product(1003, "Tablet", 15000);
            return List.of(p1,p2,p3);
        }
}
