package com.company.devices;

import com.company.Application;
import com.company.Human;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone extends Device implements Salleable {
    private String appToInstall;
    private String name;
    private Double version;
    private List<String> appsToInstall;
    private URL url;
    private List<Application> appsList = new ArrayList<>();
    private Human phoneOwner;

    private final static String SERVER = "default adres";
    private final static String PROTOCOL = "TCP";
    private final static String VERSION_NAME = "VERSION ONE";


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

    public void install(Application application) {
        if (phoneOwner.getCash() > application.getPrice()) {
            appsList.add(application);
            phoneOwner.setCash(phoneOwner.getCash() - application.getPrice());

        }
    }

    public boolean isAppInstalled(Application application) {
        return appsList.contains(application);
    }

    public boolean isAppInstalled(String appName) {
        for (Application application : appsList) {
            if (application.getName() == appName) {
                return true;
            }
        }
        return false;
    }

    public void printFreeApp() {
        for (Application application : appsList) {
            if (application.getPrice() == 0.0) {
                System.out.println(application.getName());
            }
        }
    }

    public Double sumAppValues() {
        Double values = 0.0;
        for (Application application : appsList) {
            values += application.getPrice();
        }
        return values;

    }

    public void printAppsNames() {
        List<String> appsNames = new ArrayList<>();

        for (Application application : appsList) {
            appsNames.add(application.getName());

        }
        Collections.sort(appsNames);

        for (String appsName : appsNames) {
            System.out.println(appsName);

        }
    }

    public void printAppsPrices() {
        List<Double> appsPrices = new ArrayList<>();

        for (Application application : appsList) {
            appsPrices.add(application.getPrice());

        }
        Collections.sort(appsPrices);

        for (Double appsPrice: appsPrices) {
            System.out.println(appsPrice);

        }

    }

    public Human getPhoneOwner() {
        return phoneOwner;
    }

    public void setPhoneOwner(Human phoneOwner) {
        this.phoneOwner = phoneOwner;
    }
}
