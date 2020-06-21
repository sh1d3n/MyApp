package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.Salleable;

import java.time.LocalDateTime;

public class Human implements Salleable {
    private Car car;
    private String firstName;
    private String lastName;
    private Phone mobile;
    private Animal pet;
    private Double salary = 1000.0;
    private Double cash;



    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double getSalary() {
        System.out.println("Last salary was checked " + LocalDateTime.now());
        System.out.println("Salary was " + salary);
        return salary;
    }
    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("I think it's impossible");
        } else {
            System.out.println("New data  has been sent to the accounting system");
            System.out.println("You need to pick up annex from Mrs Hanna. You can find her at human resources");
            System.out.println("Don't try to be sneaky with your income , ZUS and US already know everything");
        }
        this.salary=salary;
    }



    public void riseMySalary() {
        this.salary *= 1.1;
    }

    public Car getCar() {
        return car;

    }

    public void setCar(Car car) {
        if (car.getValue()<salary) {
            System.out.println("You bought a car");
            this.car=car;
        } else if (salary>car.getValue()/12) {
            System.out.println("You bought a car on loan");
            this.car=car;
        } else {
            System.out.println("You have to get some money");
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Phone getMobile() {
        return mobile;
    }

    public void setMobile(Phone mobile) {
        this.mobile = mobile;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Human{" +
                "car=" + car +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile=" + mobile +
                ", pet=" + pet +
                ", salary=" + salary +
                '}';

    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("You can't trade people");
    }

    public Human() {
    }
}

