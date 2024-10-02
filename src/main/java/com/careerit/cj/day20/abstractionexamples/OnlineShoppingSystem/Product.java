package com.careerit.cj.day20.abstractionexamples.OnlineShoppingSystem;

abstract class Product {

    private String pid;
    private String name;
    private double price;
    private int discount;
    private int rating;

    public Product(String pid, String name, double price, int discount, int rating) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.rating = rating;
    }

    abstract double getDiscountedPrice(double price, int discount);
}