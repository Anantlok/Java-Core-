package com.mycompany.lalitidlisachamakerprivatelimited;

public class Cylinder {

    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeigth(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCylinderVolume() {
        return 3.14 * radius * radius * height;
    }
}
