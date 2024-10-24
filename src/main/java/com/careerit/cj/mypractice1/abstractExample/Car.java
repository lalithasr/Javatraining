package com.careerit.cj.mypractice1.abstractExample;

public class Car extends Vehicle {


    void start() {
        System.out.println("Car is starting");
    }


    void stop() {
        System.out.println("Car is stopping");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.start();
        car.stop();
    }
}
