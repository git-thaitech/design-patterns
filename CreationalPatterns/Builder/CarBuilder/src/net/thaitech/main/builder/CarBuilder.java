package net.thaitech.main.builder;

public interface CarBuilder {
    CarBuilder setBrand(String brand);

    CarBuilder setModel(String model);

    CarBuilder setYear(int year);

    CarBuilder setColor(String color);

    Car build();
}
