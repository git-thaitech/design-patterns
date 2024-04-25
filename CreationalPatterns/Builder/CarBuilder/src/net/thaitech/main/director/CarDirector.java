package net.thaitech.main.director;

import net.thaitech.main.builder.Car;
import net.thaitech.main.builder.CarBuilder;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct() {
        return carBuilder
                .setBrand("Toyota")
                .setModel("Corolla")
                .setYear(2022)
                .setColor("White")
                .build();
    }
}
