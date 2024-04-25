package net.thaitech.main.vehicles;

public class Truck extends Vehicle {
    @Override
    public void start() {
        System.out.println("Truck loaded and started.");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped.");
    }
}
