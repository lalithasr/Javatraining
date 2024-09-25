package com.careerit.cj.day7;

public class SpecialChar {

        public static void main(String[] args) {
            String name = "\"Venkat\"";
            String email = "\\venkat@email.com\\";
            String address = "\'Hyderabad\' \'Telangana\'";
            System.out.println(name + ": " + email + ": " + address);
        }
}
