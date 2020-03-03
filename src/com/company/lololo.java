 package com.company;

import java.io.File;
public class lololo {
    final static Double DEFAULT_WEIGHT_DOG = 12.0;
    final static Double DEFAULT_WEIGHT_LION = 190.0;
    final static Double DEFAULT_WEIGHT_MOUSE = 0.01;
    final String species;
    String name;
    private Double weight;
    File pic;

    public lololo(String species) {

        this.species = species;

        if (this.species == "mouse") {
            weight = DEFAULT_WEIGHT_MOUSE;
        } else if (this.species == "dog") {
            weight = DEFAULT_WEIGHT_DOG;
        } else {
            weight = DEFAULT_WEIGHT_LION;
        }
    }

    void feed() {
        if(weight <0){
            System.out.println("too late , sorry food will not help since I'm dead");
        }else {
            weight++;
            System.out.println("thx, my weight is now " + weight);
        }

    }

    void takeForAWalk() {
        weight--;
        if (weight > 3) {
            System.out.println("nice walk ,my weight is"+weight);
        }else if (weight >0){
            System.out.println("");
        }else {
            System.out.println("");
        }
    }
}