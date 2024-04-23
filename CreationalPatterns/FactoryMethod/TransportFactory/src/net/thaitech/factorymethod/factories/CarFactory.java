package net.thaitech.factorymethod.factories;

import net.thaitech.factorymethod.vehicles.Car;
import net.thaitech.factorymethod.Vehicle;

public class CarFactory {
    public static Vehicle createVehicle() {
        return new Car();
    }
}
