package com.company;

import java.time.LocalDateTime;

public class Human {
    private Car car;
    private String firstName;
    private String lastName;
    private Phone mobile;
    private Animal pet;
    private Double salary = 1000.0;



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
        this.car=car;
//        if (car.getValue() == null || car.getValue() > this.salary * 12) {
//            throw new Exception("nie stać Cię");
//        } else this.car = car;
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

}

