package com.company;

import java.io.File;

public class Animal {
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
}