package com.careerit.cj.exception;

public class NullPointerExceptionExample {

        public static void main(String[] args) {
            String name = null;
            try {
                System.out.println(name.length());
            } catch (NullPointerException e) {
                System.out.println("Caught null pointer exception" + e.getMessage());
            }
        }
}
