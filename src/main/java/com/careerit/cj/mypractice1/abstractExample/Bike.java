package com.careerit.cj.mypractice1.abstractExample;

public class Bike extends Vehicle {

        public static void main(String[] args) {
            Bike bike = new Bike();
            bike.run();
            bike.start();
            bike.stop();
        }



        public void start() {
            System.out.println("Bike is starting");
        }

        public void stop() {
            System.out.println("Bike is stopping");
        }
}
