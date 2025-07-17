package com.mycompany.lalitidlisachamakerprivatelimited;

public class Estimation {

    public static void printEstimation(Operation op) {
        double deepCount = op.getTrayRackObject().getTrayObject().getDeepObject().getDeepCount();
        double trayCount = op.getTrayRackObject().getTrayObject().getTrayCount();
        System.out.println("Rack Volume : " + op.getRackVolume());
        System.out.println("One deep volume : " + op.getDeepVolume());
        System.out.println("Total volume of all deeps in one tray : " + op.getDeepVolume() * deepCount);
        System.out.println("Tray Area   : " + op.getTrayArea());
        System.out.println("Total Tray Area  : " + op.getTrayArea() * trayCount);

    }
}
