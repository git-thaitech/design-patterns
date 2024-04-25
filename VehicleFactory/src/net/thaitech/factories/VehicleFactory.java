package net.thaitech.factories;

import net.thaitech.vehicles.Vehicle;

public interface VehicleFactory {
    Vehicle createCar();

    Vehicle createBicycle();

    Vehicle createTruck();
}
