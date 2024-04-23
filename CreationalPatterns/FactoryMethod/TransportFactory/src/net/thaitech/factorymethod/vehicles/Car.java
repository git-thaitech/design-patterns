package net.thaitech.factorymethod.vehicles;

import net.thaitech.factorymethod.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine starts.");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stops.");
    }
}
