package com.careerit.cj.day20.abstractionexamples.OnlineShoppingSystem;

public class Electronics extends Product {

    public Electronics(String pid, String name, double price, int discount, int rating, String brand, String model) {
        super(pid, name, price, discount, rating);
        System.out.println("Electronics object created : " + pid + " Name of the Gadget " + name + " Price of the Gadget " + price + " We will provide the discount " + discount + " Rating of the customer" + rating + " Name of the electronic gadget" + brand + " Electronics model" + model);
    }

    @Override
    double getDiscountedPrice(double price, int discount) {
        System.out.println("The discounted price of the electronic gadget is : " + (price - (price * discount / 100)));
        return price - (price * discount / 100);

    }

}
