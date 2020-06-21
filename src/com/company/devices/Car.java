package com.company.devices;

import com.company.Human;

import java.util.Objects;

public abstract  class Car extends Device implements Salleable {

    private String plates;
    private Integer value = 10000;
    public abstract void refuel();


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


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return
                Objects.equals(plates, car.plates) &&
                        Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plates, value);
    }

    @Override
    public void turnOn() {
        System.out.println("turnOn from car");
    }

    @Override
    public String toString() {
        return "Car{" +
                ", plates='" + plates + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() != null) {
            if (buyer.getCash() > price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.setCar(seller.getCar());
                seller.setCar(null);
                System.out.println("Car deal");
            }
        }
    }
}

