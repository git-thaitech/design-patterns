package net.thaitech.factorymethod.vehicles;

import net.thaitech.factorymethod.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck engine starts.");
    }

    @Override
    public void stop() {
        System.out.println("Truck engine stops.");
    }
}
