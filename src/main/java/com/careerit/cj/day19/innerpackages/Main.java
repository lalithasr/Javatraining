package com.careerit.cj.day19.innerpackages;

public class Main {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        int innerY = outer.getInnerY();
        System.out.println(innerY + " " + outer.x);
        System.out.println(outer.x + innerY);
    }
}
