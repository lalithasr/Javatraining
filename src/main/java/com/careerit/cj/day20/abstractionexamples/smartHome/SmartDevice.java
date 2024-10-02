package com.careerit.cj.day20.abstractionexamples.smartHome;

abstract class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName){
        this.deviceName = deviceName;
    }

    public abstract void turnon();
    public abstract void turnoff();
}
