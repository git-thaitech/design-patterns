package net.thaitech.factories;

import net.thaitech.vehicles.Car;
import net.thaitech.vehicles.Bicycle;
import net.thaitech.vehicles.Truck;
import net.thaitech.vehicles.Vehicle;

public class ConcreteVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createCar() {
        return new Car();
    }

    @Override
    public Vehicle createBicycle() {
        return new Bicycle();
    }

    @Override
    public Vehicle createTruck() {
        return new Truck();
    }
}
