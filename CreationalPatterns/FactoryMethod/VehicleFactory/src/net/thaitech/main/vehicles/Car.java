package net.thaitech.main.vehicles;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Car brakes applied, vehicle stopped.");
    }
}
