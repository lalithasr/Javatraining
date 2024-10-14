package com.careerit.cj.exception;

public class NumberFormatExceptionFormatExample {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Problem while converting string to number " + e.getMessage());
        }
    }
}
