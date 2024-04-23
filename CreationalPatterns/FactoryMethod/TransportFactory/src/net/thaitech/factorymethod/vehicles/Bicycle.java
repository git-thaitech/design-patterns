package net.thaitech.factorymethod.vehicles;

import net.thaitech.factorymethod.Vehicle;

public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle starts pedaling.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stops pedaling.");
    }
}
