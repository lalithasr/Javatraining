package com.careerit.cj.day20.abstractionexamples.RestaurantManagementSystem;

abstract class FoodItem {
    protected String name;
    protected double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void prepare();
    public abstract void serve();

}
