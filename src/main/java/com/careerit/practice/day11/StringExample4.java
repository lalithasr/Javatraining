package com.careerit.practice.day11;

public class StringExample4 {
    public static void main(String[] args) {

        String data = "1234-Manoj-35-SSGA,2345-Krish-32-Wipro,2346-RAMS-28-MTR";
        String users[] = data.split(",");
        System.out.println("Name and Company name of all users");
        for (String user : users) {
            String[] arr = user.split("-");
            String name = arr[1];
            String company = arr[3];
            System.out.println("Name : " + name + ", Company : " + company);
        }

    }

}