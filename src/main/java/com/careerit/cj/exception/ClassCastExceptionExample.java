package com.careerit.cj.exception;

public class ClassCastExceptionExample {

    public static void main(String[] args) {
        Object x ="Hello";
        try {
            Integer y = (Integer) x;
        } catch (ClassCastException e) {
            System.out.println("Problem while casting object to Integer " + e.getMessage());
        }
    }
}
