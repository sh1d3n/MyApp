package com.company;

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

        Car car = new Car("fiat","audi");
        human.setCar(car);
    }
}