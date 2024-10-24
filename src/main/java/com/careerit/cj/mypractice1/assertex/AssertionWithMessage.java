package com.careerit.cj.mypractice1.assertex;
import java.lang.*;

public class AssertionWithMessage {
    public static void main(String[] args) {
        int age = -1;
        assert age >= 0 : "Age cannot be negative!";
        System.out.println("Age is: " + age);
    }
}
