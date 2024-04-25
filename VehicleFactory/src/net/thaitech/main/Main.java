package net.thaitech.main;

import net.thaitech.factories.VehicleFactory;
import net.thaitech.factories.ConcreteVehicleFactory;
import net.thaitech.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Ẩn đi chi tiết thực thi khi tạo các đối tượng
        VehicleFactory factory = new ConcreteVehicleFactory();

        Vehicle myCar = factory.createCar();
        myCar.drive();

        Vehicle myBike = factory.createBicycle();
        myBike.drive();

        Vehicle myTruck = factory.createTruck();
        myTruck.drive();
    }
}
