package net.thaitech.main.vehicles;

public class Bicycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle has started moving.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle has stopped.");
    }
}
