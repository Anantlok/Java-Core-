package com.mycompany.lalitidlisachamakerprivatelimited;

public class TrayRack {

    private Rack rackObject;
    private Tray trayObject;

    public TrayRack(double rackHeight, double rackRadius, double trayRadius, double deepRadius, double trayCount, double deepCount) {
        rackObject = new Rack(rackHeight, rackRadius);
        trayObject = new Tray(trayRadius, trayCount, deepRadius, deepCount);
    }

    public Rack getRackObject() {
        return rackObject;
    }

    public void setRackObject(Rack rackObject) {
        this.rackObject = rackObject;
    }

    public Tray getTrayObject() {
        return trayObject;
    }

    public void setTrayObject(Tray trayObject) {
        this.trayObject = trayObject;
    }
    
    
}
