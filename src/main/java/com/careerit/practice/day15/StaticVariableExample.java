package com.careerit.practice.day15;
import java.io.PrintStream;

class CareerIt{
    public static PrintStream out = System.out;
}

public class StaticVariableExample {
    public static void main(String[] args) {
        CareerIt.out.println("Hello World");
    }

}
