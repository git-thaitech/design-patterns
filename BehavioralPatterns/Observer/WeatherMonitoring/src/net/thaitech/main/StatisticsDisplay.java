package net.thaitech.main;

public class StatisticsDisplay implements Display {
    private double maxTemp = 0.0;
    private double minTemp = 200;
    private double tempSum = 0.0;
    private int numReadings;

    public StatisticsDisplay(WeatherStation weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(double temperature) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
