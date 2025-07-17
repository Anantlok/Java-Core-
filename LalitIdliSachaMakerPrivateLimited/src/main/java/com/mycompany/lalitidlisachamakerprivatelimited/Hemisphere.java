package com.mycompany.lalitidlisachamakerprivatelimited;

public class Hemisphere {

    private double radius;

    public Hemisphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHemisphereVolume() {
        return (2.0 / 3) * 3.14 * radius * radius * radius;
    }
    
    public double getHemisphereTopArea() {
        return 3.14*radius;
    }
    

}
