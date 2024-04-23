package net.thaitech.factorymethod.factories;

import net.thaitech.factorymethod.vehicles.Truck;
import net.thaitech.factorymethod.Vehicle;

public class TruckFactory {
    public static Vehicle createVehicle() {
        return new Truck();
    }
}
