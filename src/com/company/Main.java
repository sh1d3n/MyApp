package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Michał", "Jakusz");
        Phone phone = new Phone();

        Animal dog = new Animal("dog");
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();

        Car car = new Car();
        human.setCar(car);
        Car car2=new Car();
        System.out.println(car.equals(car2));
        System.out.println(car);
        System.out.println(car2);
        System.out.println(human);
        System.out.println(dog);
        car.turnOn();
        phone.turnOn();

    }

}