package com.company.devices;

public abstract class Device {
    private String producer;
    private String model;
    private Integer yearOfProduction;
    private Integer value = 10000;
    public abstract void turnOn();
    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public Integer getValue() {
        return value;
    }
}
