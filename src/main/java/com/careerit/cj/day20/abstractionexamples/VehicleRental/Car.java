package com.careerit.cj.day20.abstractionexamples.VehicleRental;

public class Car extends Vehicle {

    private int noOfSeats;

    public Car(String regNumber, String ownerName, String model, double price, int noOfSeats) {
        super(regNumber, ownerName, model, price);
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String showDetails(String regNumber, String ownerName, String model, double price) {
        System.out.println("Reg number : " + regNumber);
        System.out.println("Owner name : " + ownerName);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("No of seats : " + noOfSeats);
        return "Reg number for the car is : " + regNumber + " which is owned by : " + ownerName + " which has Model number: " + model + " Price : " + price ;

    }
}
