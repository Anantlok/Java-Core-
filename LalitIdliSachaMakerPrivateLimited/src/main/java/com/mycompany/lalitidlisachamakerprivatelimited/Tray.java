package com.mycompany.lalitidlisachamakerprivatelimited;

public class Tray {

    private double trayCount;
    private Circle trayObject;
    private Deep deepObject;

    public Tray(double trayRadius, double trayCount, double deepRadius, double deepCount) {
        this.trayCount = trayCount;
        trayObject = new Circle(trayRadius);
        deepObject = new Deep(deepRadius, deepCount);
    }

    public double getTrayCount() {
        return trayCount;
    }

    public void setTrayCount(double trayCount) {
        this.trayCount = trayCount;
    }

    public Circle getTrayObject() {
        return trayObject;
    }

    public void setTrayObject(Circle trayObject) {
        this.trayObject = trayObject;
    }

    public Deep getDeepObject() {
        return deepObject;
    }

    public void setDeepObject(Deep deepObject) {
        this.deepObject = deepObject;
    }
}
