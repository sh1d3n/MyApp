package com.company;

import com.company.devices.Car;

public class Main {
    public static void main(String[] args){
        lololo dog=new lololo("dog");
        dog.name="Haiko";

        Human me =new Human();
        me.firstName="Michał";
        me.lastName="Jakusz";
        me.pet=dog;
        System.out.println(me.pet.species);
        System.out.println(me.pet.name);
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        Car dirtyOne= new Car();
        dirtyOne.producer = "fiat";
        dirtyOne.model="audi";
        dirtyOne.yearOfProduction= 2018;
        dirtyOne.plates="G0BARCA";
        me.setCar (dirtyOne);
        System.out.println(me.getCar.getPlates());
        Human myWife = new Human();
        myWife.firstName ="Ania";
        myWife.lastName="Jakusz";
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        myWife.riseMySalary();
        System.out.println(myWife.getCar().getPlates());
        System.out.println(me.getCar());
        myWife.feed();

    }
}

























    }
}
