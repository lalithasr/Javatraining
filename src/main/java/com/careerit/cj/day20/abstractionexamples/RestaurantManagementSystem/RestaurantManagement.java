package com.careerit.cj.day20.abstractionexamples.RestaurantManagementSystem;

public class RestaurantManagement {

        public static void main(String[] args) {

            FoodItem[] items = new FoodItem[5];
            items[0] = new MainCourse("Biryani", 200);
            items[1] = new MainCourse("Fried Rice", 150);
            items[2] = new MainCourse("Chicken Curry", 250);
            items[3] = new MainCourse("Mutton Curry", 300);
            items[4] = new MainCourse("Fish Curry", 350);

            for (FoodItem item : items) {
                item.prepare();
                item.serve();
            }

        }
}
