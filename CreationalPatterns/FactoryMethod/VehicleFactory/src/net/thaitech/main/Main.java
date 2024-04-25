package net.thaitech.main;

import net.thaitech.main.factories.*;
import net.thaitech.main.vehicles.*;

public class Main {
    public static void main(String[] args) {
        VehicleFactory bicycleFactory = new BicycleFactory();
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();

        Vehicle bicycle = bicycleFactory.createVehicle();
        Vehicle car = carFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();

        bicycle.start();
        car.start();
        truck.start();

        bicycle.stop();
        car.stop();
        truck.stop();
    }
}
