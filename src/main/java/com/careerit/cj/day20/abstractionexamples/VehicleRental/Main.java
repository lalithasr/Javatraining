package com.careerit.cj.day20.abstractionexamples.VehicleRental;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the car number:");
            String regNumber = sc.nextLine();
            System.out.println("Enter the owner name:");
            String ownerName = sc.nextLine();
            System.out.println("Enter the model:");
            String model = sc.nextLine();
            System.out.println("Enter the price:");
            double price = sc.nextDouble();
            System.out.println("Enter the no of seats:");
            int noOfSeats = sc.nextInt();
            Vehicle car = new Car(regNumber, ownerName, model, price, noOfSeats);
            System.out.println(car.showDetails(regNumber, ownerName, model, price));

        }
}
