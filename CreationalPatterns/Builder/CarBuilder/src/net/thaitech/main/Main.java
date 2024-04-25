package net.thaitech.main;

import net.thaitech.main.builder.*;
import net.thaitech.main.director.CarDirector;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilderImpl();
        CarDirector carDirector = new CarDirector(carBuilder);
        Car car = carDirector.construct();
        System.out.println(car);
    }
}
