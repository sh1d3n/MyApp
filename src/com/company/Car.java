package com.company;

public class Car {
    private String producer;
    private String model;
    private Integer yearOfProduction;
    private String plates;
    private Integer value;

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

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

