package net.thaitech.main;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);

        weatherStation.setTemperature(35.5);
        weatherStation.setTemperature(36.5);
        weatherStation.setTemperature(33.2);
    }
}
