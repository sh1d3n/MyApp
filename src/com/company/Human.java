package com.company;

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
        return salary;
    }

    public void riseMySalary() {
        this.salary *= 1.1;
    }

    public Car getCar() {
        return car;

    }

    public void setCar(Car car) throws Exception {
        if (car.getValue() == null || car.getValue() > this.salary * 12) {
            throw new Exception("nie stać Cię");
        } else this.car = car;
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

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

