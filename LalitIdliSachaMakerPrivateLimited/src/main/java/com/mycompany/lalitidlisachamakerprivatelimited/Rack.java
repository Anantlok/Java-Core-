package com.mycompany.lalitidlisachamakerprivatelimited;

public class Rack {

    private Cylinder rackObject;

    public Rack(double height, double radius) {
        rackObject = new Cylinder(height, radius);
    }

    public Cylinder getRackObject() {
        return rackObject;
    }

    public void setRackObject(Cylinder rackObject) {
        this.rackObject = rackObject;
    }

}
