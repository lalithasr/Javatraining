package com.careerit.cj.exception;

public class CustomExceptionExample {

    public static void main(String[] args) {
        int age = 10;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age should be greater than 18");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Caught invalid age exception : " + e.getMessage());
        }
    }
}
