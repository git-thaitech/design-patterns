package net.thaitech.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "16 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println("Computer HDD: " + computer.getHDD());
        System.out.println("Computer RAM: " + computer.getRAM());
        System.out.println("Computer Graphics Card: " + (computer.isGraphicsCardEnabled() ? "Enabled" : "Disabled"));
        System.out.println("Computer Bluetooth: " + (computer.isBluetoothEnabled() ? "Enabled" : "Disabled"));
    }
}
