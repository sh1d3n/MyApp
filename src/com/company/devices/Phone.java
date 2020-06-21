package com.company.devices;

import com.company.Human;

import java.net.URL;
import java.util.List;

public class  Phone extends Device implements Salleable {
    private String appToInstall;
    private String name;
    private Double version;
    private List<String> appsToInstall;
    private URL url;
    private final static String SERVER="default adres";
    private final static String PROTOCOL="TCP";
    private final static String VERSION_NAME="VERSION ONE";


    public Phone(String appToInstall) {
        this.appToInstall = appToInstall;
    }

    public Phone(URL url) {
        this.url = url;
    }

    public Phone(List<String> appsToInstall) {
        this.appsToInstall = appsToInstall;
    }

    public Phone(String name, Double version) {
        this.name = name;
        this.version = version;

    }

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

    public Phone() {
    }
}
