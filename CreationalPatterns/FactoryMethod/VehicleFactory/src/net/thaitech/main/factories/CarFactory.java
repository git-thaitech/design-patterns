package net.thaitech.main.factories;

import net.thaitech.main.vehicles.Car;
import net.thaitech.main.vehicles.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
