package net.thaitech.factorymethod.factories;

import net.thaitech.factorymethod.vehicles.Bicycle;
import net.thaitech.factorymethod.Vehicle;

public class BicycleFactory {
    public static Vehicle createVehicle() {
        return new Bicycle();
    }
}
