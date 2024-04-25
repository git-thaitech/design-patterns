package net.thaitech.main;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Display> observers;
    private double temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Display o) {
        observers.add(o);
    }

    public void removeObserver(Display o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Display observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
