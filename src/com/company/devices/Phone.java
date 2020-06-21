package com.company.devices;

import com.company.Human;

public class Phone extends Device implements Salleable {

    @Override
    public void turnOn() {
        System.out.println("turnOn from Phone");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getMobile() != null) {
            if (buyer.getCash() > price) {
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.setMobile(seller.getMobile());
                seller.setMobile(null);
                System.out.println("Phone deal");
            }
        }

    }
}
