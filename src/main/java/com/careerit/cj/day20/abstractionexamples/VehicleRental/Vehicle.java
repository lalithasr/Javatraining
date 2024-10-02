package com.careerit.cj.day20.abstractionexamples.VehicleRental;

abstract class Vehicle {
    protected String regNumber;
    protected String ownerName;
    protected String model;
    protected double price;

    public Vehicle(String regNumber, String ownerName, String model, double price) {
        this.regNumber = regNumber;
        this.ownerName = ownerName;
        this.model = model;
        this.price = price;
    }

    public abstract String showDetails(String regNumber, String ownerName, String model, double price);
}
