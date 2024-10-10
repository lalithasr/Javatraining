package com.careerit.cj.wrapperClassExamples;

public class WrapperMethodsExample {
    public static void main(String[] args) {
       int intValue = Integer.parseInt("123");
       System.out.println(" Parsed int value "+ intValue);
       double doubleValue = Double.parseDouble("123.45");
       System.out.println(" Parsed double value " + doubleValue);
       String str = Integer.toString(123);
       System.out.println(" String converted into value " + str);
       String str1 = Double.toString(123.45);
       System.out.println(" Given string value " + str1);
       Integer integerValue = Integer.valueOf("123");
       System.out.println(integerValue);
       Float floatValue = Float.valueOf("123.45");
       System.out.println(floatValue);
    }
}
