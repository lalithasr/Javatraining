package com.careerit.cj.day20.abstractionexamples.smartHome;

public class Main {

    public static void main(String[] args) {

        SmartDevice light = new SmartLight("Light");

        light.turnon();
        light.turnoff();


    }
}
