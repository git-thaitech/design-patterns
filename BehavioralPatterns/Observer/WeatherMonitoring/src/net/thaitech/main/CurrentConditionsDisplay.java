package net.thaitech.main;

public class CurrentConditionsDisplay implements Display {
    private double temperature;

    public CurrentConditionsDisplay(WeatherStation weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees");
    }
}
