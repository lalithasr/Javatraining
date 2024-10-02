package com.careerit.cj.day20.abstractionexamples.RestaurantManagementSystem;

public class MainCourse extends FoodItem {

    public MainCourse(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing main course item : " + name);
    }

    @Override
    public void serve() {
        System.out.println("Serving main course item : " + name);
    }
}
