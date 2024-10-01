package com.careerit.cj.day17.Inheritance2;

public class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void run() {
        System.out.println("Dog is running");
    }

    public void sound() {
        System.out.println("Dog is making sound");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.run();
        dog.sound();
        dog.bark();
    }
}
