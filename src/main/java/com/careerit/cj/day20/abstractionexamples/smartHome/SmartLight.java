package com.careerit.cj.day20.abstractionexamples.smartHome;

public class SmartLight extends SmartDevice {

    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnon() {
        System.out.println(deviceName + " is turned on");
    }

    @Override
    public void turnoff() {
        System.out.println(deviceName + " is turned off");
    }
}
