package com.careerit.cj.wrapperClassExamples;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String name;
    private String email;
    private Integer age;

    public Customer(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Age: "+age);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the email: ");
        String email = sc.nextLine();
        System.out.println("Enter the age: ");
        int age = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(name, email, age));
        System.out.println("Do you want to add more customers (yes/no): ");
        String choice = sc.nextLine();
        while(choice.equals("yes")){
            System.out.println("Enter the name: ");
            name = sc.nextLine();
            System.out.println("Enter the email: ");
            email = sc.nextLine();
            System.out.println("Enter the age: ");
            age = Integer.parseInt(sc.nextLine());
            customers.add(new Customer(name, email, age));
            System.out.println("Do you want to add more customers (yes/no): ");
            choice = sc.nextLine();
        }
        for(Customer c: customers){
            if(c.getAge() > 18 && c.getAge() > 0){
                System.out.println("Customer is eligible");
                c.showDetails();
            } else if (c.getAge() < 18 ){
                System.out.println("Customer is not eligible");
            } else if(c.getAge() < 0){
                System.out.println("Enter a valid age");
            } else {
                System.out.println("Patient is older need a guardian");
            }
        }
        sc.close();
        System.out.println("Thank you for using our service");
        }


}
