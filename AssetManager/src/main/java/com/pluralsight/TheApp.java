package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;

public class TheApp {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        //Add the houses
        assets.add(new House("My house", "2009-04-07", 250000.0, "2453 Catalan Drive", "excellent", 5000.0, 5000));
        assets.add(new House("Vacation home", "2014-07-07", 180000.0, "9600 Barca Road", "good", 4000.0, 2500));

        //Add the cars
        assets.add(new Vehicle("My truck", ( "2018-06-09"), 5000.0, "Ford F-150", 2017, 65000));
        assets.add(new Vehicle("My 2nd truck",("2020-02-14"), 6000.0, "Toyota Tacoma", 2019,20000));

        for (Asset asset : assets){
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired: " + asset.dateAcquired);
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + String.format("%.2f",asset.getValue()));

            if (asset instanceof House){
                House h = (House) asset;
                System.out.println("Address: " + h.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle v = (Vehicle) asset;
                System.out.println("Year & Make/Model: " + v.getYear() + " " + v.getMakeModel());
            }

            System.out.println();
        }
    }
}
