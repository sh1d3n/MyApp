package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Michał", "Jakusz");
        Phone phone = new Phone();

        Pet dog = new Pet("dog");
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();

        LPG car = new LPG();
        human.setCar(car);
        LPG car2=new LPG();
        System.out.println(car.equals(car2));
        System.out.println(car);
        System.out.println(car2);
        System.out.println(human);
        System.out.println(dog);
        car.turnOn();
        phone.turnOn();

        Human seller= new Human();
        seller.setPet(dog);
        seller.setCash(15000.0);
        Human buyer=new Human();
        buyer.setCash(100000.0);
        dog.sell(seller,buyer,10000.0);

    }

}