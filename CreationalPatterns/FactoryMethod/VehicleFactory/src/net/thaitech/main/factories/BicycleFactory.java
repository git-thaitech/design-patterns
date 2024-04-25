package net.thaitech.main.factories;

import net.thaitech.main.vehicles.Bicycle;
import net.thaitech.main.vehicles.Vehicle;

public class BicycleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
