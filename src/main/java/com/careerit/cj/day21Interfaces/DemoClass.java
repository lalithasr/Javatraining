package com.careerit.cj.day21Interfaces;

public class DemoClass implements FirstInterface, SecondInterface {

    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }

    public void myCommonMethod() {
        System.out.println("Common method...");
    }

    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.myMethod();
        obj.myOtherMethod();
        obj.myCommonMethod();
    }
}
