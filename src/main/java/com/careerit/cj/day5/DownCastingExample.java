package com.careerit.cj.day5;

public class DownCastingExample {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.sound();
        Dog dog = (Dog) animal;
        dog.sound();
    }
}
