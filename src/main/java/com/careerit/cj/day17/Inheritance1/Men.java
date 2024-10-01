package com.careerit.cj.day17.Inheritance1;

import java.util.Scanner;

public class Men extends Human {

    @Override
    public void eat() {
        System.out.println(" Man is eating ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Person:");
        String name = sc.nextLine();
        Human human = new Men();
        human.eat();
    }
}
