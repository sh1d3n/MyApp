package com.company.devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Car extends Device implements Salleable {

    private String plates;

    private List<String> owners = new ArrayList<>();
    private List<String> transactions = new ArrayList<>();

    public abstract void refuel();


    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) throws RuntimeException {
        if (plates.length() > 8) {
            throw new RuntimeException();
        } else {
            this.plates = plates;
        }
    }


    @Override
    public void turnOn() {
        System.out.println("turnOn from car");
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCar(0) != null && owners.size() == 0 || owners.get(owners.size() - 1).equals(seller.getLastName())) {
            if (buyer.getCar(0) == null) {
                if (buyer.getCash() > price) {
                    buyer.setCar(0, seller.getCar(0));
                    seller.setCar(0, null);
                    buyer.setCash(buyer.getCash() - price);
                    seller.setCash(seller.getCash() + price);
                    System.out.println("Transaction success");
                    owners.add(buyer.getLastName());
                    transactions.add("Car was sold from " + seller.getLastName() + " to: " + buyer.getLastName());
                } else {
                    throw new Exception("Not enough for buyer");
                }
            } else {
                throw new Exception("Buyer has no space");
            }
        } else {
            throw new Exception("Seller hasn't got car in garage");
        }
    }

    public boolean wasOwner(String lastName) {
        return owners.contains(lastName);
    }

    public boolean wasCarSelled(Human seller, Human buyer) {
        if (owners.contains(seller.getLastName())) {
            int index = owners.indexOf(seller.getLastName());

            if (owners.get(index + 1).equals(buyer.getLastName())) {
                return true;
            }
        }
        return false;
    }


//    @Override
//    public void sell(Human seller, Human buyer, Double price) {
//        if (seller.getCar() != null) {
//            if (buyer.getCash() > price) {
//                buyer.setCash(buyer.getCash() - price);
//                seller.setCash(seller.getCash() + price);
//                buyer.setCar(seller.getCar());
//                seller.setCar(null);
//                System.out.println("Car deal");
//            }
//        }
//    }
}

