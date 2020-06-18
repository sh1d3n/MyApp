package com.company;

public class Car {
    private final String producer;
    private final String model;
    private Integer yearOfProduction;
    private String plates;
    private Integer value;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) throws RuntimeException {
        if (plates.length() > 8) {
            throw new RuntimeException();
        } else {
            this.plates = plates;
        }
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

