package com.careerit.cj.mypractice1.abstractExample;

abstract class Vehicle {

    public void run() {
        System.out.println("Vehicle is running");
    }
    abstract void start();

    abstract void stop();
}
