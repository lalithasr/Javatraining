package com.careerit.practice.day10;

public class EnumExample {

    enum Color {
        RED, GREEN, BLUE;
    }
    enum Size {
        SMALL, MEDIUM, LARGE;
    }

    public static void main(String[] args) {

        sendShirtInfo("Nike", Color.RED, Size.LARGE);
        sendShirtInfo("Adidas", Color.GREEN, Size.MEDIUM);
        sendShirtInfo("Puma", Color.BLUE, Size.SMALL);
    }

    public static void sendShirtInfo(String name, Color color, Size size) {
        System.out.println("Color : " + color + " Size : " + size);
    }
}
