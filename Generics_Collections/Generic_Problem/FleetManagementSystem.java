package com.gla.Generics_Collections.Generic_Problem;

import java.util.*;

class Vehicle {
    String name;
    Vehicle(String name) {
        this.name = name;
    }
}

class Truck extends Vehicle {
    Truck(String name) {
        super(name);
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }
}

class FleetManager<T extends Vehicle> {
    ArrayList<T> list = new ArrayList<>();
    public void addVehicle(T v) {
        list.add(v);
    }

    public void showFleet() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name);
        }
    }
}
public class FleetManagementSystem {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Tata Truck"));
        truckFleet.addVehicle(new Truck("Ashok Leyland"));

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Royal Enfield"));
        bikeFleet.addVehicle(new Bike("Pulsar"));

        truckFleet.showFleet();
        bikeFleet.showFleet();
    }
}
