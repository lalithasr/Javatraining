package com.careerit.cj.ArrayListExamples;

import java.util.ArrayList;

public class Cars {
    private String carName;
    private String carModel;
    private String carColor;
    private int carPrice;

    public Cars(String carName, String carModel, String carColor, int carPrice) {
        this.carName = carName;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Cars [carName=" + carName + ", carModel=" + carModel + ", carColor=" + carColor + ", carPrice="
                + carPrice + "]";
    }

    public static void main(String[] args) {
        ArrayList<Cars> carList = new ArrayList<>();
        Cars car1 = new Cars("Audi", "A4", "Black", 5000000);
        Cars car2 = new Cars("BMW", "X1", "White", 4000000);
        Cars car3 = new Cars("Mercedes", "C200", "Red", 6000000);
        Cars car4 = new Cars("Toyota", "Innova", "Grey", 2000000);
        Cars car5 = new Cars("Hyundai", "Verna", "Silver", 1000000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
