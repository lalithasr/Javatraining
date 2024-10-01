package com.careerit.cj.day16;

import java.util.Scanner;

public class PersonEncapsulation1 {
    private String name;
    private int age;
    public PersonEncapsulation1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age should be greater than 0");
        }
    }

    public void display() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        PersonEncapsulation1 p1 = new PersonEncapsulation1(name, age);
        p1.display();
        p1.setAge(30);
        p1.display();
        sc.close();
    }
}
