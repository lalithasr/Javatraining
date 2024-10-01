package com.careerit.cj.day15.modifiers;

public class Main extends AbstarctClassEx {
    final int x = 10;
    final static double PI = 3.14;
    public void study() {
        System.out.println("Study method is implemented");
    }
    public static void main (String[] args) {
        Main obj = new Main();
        System.out.println("Practicing final keyword and static keyword");
        System.out.println("Final keyword " + obj.x);
        System.out.println("Static keyword " +Main.PI);
    }
}
