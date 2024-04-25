package net.thaitech.main.builder;

public class CarBuilderImpl implements CarBuilder {
    private String brand;
    private String model;
    private int year;
    private String color;

    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car build() {
        return new Car(brand, model, year, color);
    }
}
