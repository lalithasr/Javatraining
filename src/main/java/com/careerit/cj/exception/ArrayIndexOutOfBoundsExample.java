package com.careerit.cj.exception;

public class ArrayIndexOutOfBoundsExample {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        try{
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

    }
}
