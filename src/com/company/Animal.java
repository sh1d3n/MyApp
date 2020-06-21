package com.company;

import com.company.devices.Salleable;

import java.io.File;

public class Animal implements Salleable {
    private final String species;
    private Double weight;

    private String name;
    File pic;

    public Animal(String species) {
        this.species = species;

        if (this.species.equals("mouse")) {
            weight = 1.0;
        } else if (this.species.equals("dog")) {
            weight = 12.0;
        } else {
            weight = 5.0;
        }
    }

    void feed() {
        if (weight == 0) {
            System.out.println("too late , sorry food will not help since I'm dead");
        } else {
            weight++;
            System.out.println("thx, my weight is now " + weight);
        }

    }

    void takeForAWalk() {
        if (weight == 0) {
            System.out.println("too late , sorry  I'm dead");
        } else {
            weight--;
            System.out.println("nice walk ,my weight is" + weight);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getPet()!= null){
            if (buyer.getCash()>price){
                buyer.setCash(buyer.getCash()-price);
                seller.setCash(seller.getCash()+price);
                buyer.setPet(seller.getPet());
                seller.setPet(null);
                System.out.println("Animal deal");
            }
        }
    }
}