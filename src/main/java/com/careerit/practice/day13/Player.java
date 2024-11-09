package com.careerit.practice.day13;

public class Player {

        private String name;
        private String role;
        private String country;
        private double amount;

        public Player(String name, String role, String country, double amount) {
            this.name = name;
            this.role = role;
            this.country = country;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }

        public String getCountry() {
            return country;
        }



        public double getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Player [name=" + name + ", role=" + role + ", country=" + country +  ", Amount =" + amount
                    + "]";
        }

        public void showInfo(){
            System.out.println("Name : "+name);
            System.out.println("Role : "+role);
            System.out.println("Country : "+country);
            System.out.println("Amount : "+amount);
            System.out.println("-------------------------------------------------");
        }
}
