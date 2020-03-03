package com.company;

import com.company.devices.Car;

public class Human extends lololo {
    private Car car;
    String firstName;
    String lastName;
    Phone mobile;
    lololo pet;
    private Double salary = 1000.0;

    public Human() {
        super( "homo sapiens");
    }

    public Double getSalary(){return salary;}
    public void riseMySalary(){
    this.salary*=1.1;
    }
    public Car getCar(){
        return car;

    }
    public void setCar(Car car) throws Exception{
        if (car.value >this.salary*12) {
            throw new Exception("nie stać Cię");
        } else this.car = car;
    }
}

