package com.company.devices;

public abstract class Device {
    private String producer;
    private String model;
    private Integer yearOfProduction;
    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
