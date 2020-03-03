package com.company.devices;

public class Car {
    String producer;
    String model;
    Integer yearOfProduction;
    String plates;
    Integer value;

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) throws Exception {
        if (plates.length() > 8) {
            throw new Exception();
        } else {
            this.plates = plates;
            public String toString(){
                return this. + " " +this.model;
            }
        }
    }
}

