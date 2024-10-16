package com.careerit.cj.comparable;

public class Car implements Comparable{

        private String name;
        private double price;
        private String color;

        public Car(String name, double price, String color) {
            this.name = name;
            this.price = price;
            this.color = color;
        }

        @Override
        public int compareTo(Object o) {
            Car car = (Car) o;
            if(price < car.price) {
                return -1;
            }else if(price > car.price) {
                return 1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "Car [name=" + name + ", price=" + price + ", color=" + color + "]";
        }

        public static void main(String[] args){
            Car c1 = new Car("BMW", 5000000, "Black");
            Car c2 = new Car("Audi", 4000000, "White");
            Car c3 = new Car("Benz", 6000000, "Red");
            Car c4 = new Car("BMW", 5000000, "Black");
            System.out.println(c1.compareTo(c2));
            System.out.println(c1.compareTo(c3));
            System.out.println(c1.compareTo(c4));

            for(Car car : new Car[] {c1,c2,c3,c4}) {
                System.out.println(car);
            }
        }
}
