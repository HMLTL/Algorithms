package com.pikuza;

public class Main {

    public static void main(String[] args) {
        Constellation constellation = new Constellation();
        System.out.println("Galaxy...");
        constellation.printGalaxy();
        System.out.println("\nConstellations quantity is: " + constellation.getConstellationsQuantity());
        System.out.println("\nMarked constellations in the Galaxy...");
        constellation.printGalaxy();

    }
}
