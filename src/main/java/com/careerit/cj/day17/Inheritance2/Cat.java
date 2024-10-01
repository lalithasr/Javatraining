package com.careerit.cj.day17.Inheritance2;

public class Cat extends Animal {

    public void meow() {
        System.out.println("Cat is meowing");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public void run() {
        System.out.println("Cat is running");
    }

    public void sound() {
        System.out.println("Cat is making sound");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.run();
        cat.sound();
        cat.meow();
    }
}
