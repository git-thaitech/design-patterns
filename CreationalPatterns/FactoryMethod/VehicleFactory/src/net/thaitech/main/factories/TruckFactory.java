package net.thaitech.main.factories;

import net.thaitech.main.vehicles.Truck;
import net.thaitech.main.vehicles.Vehicle;

public class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
