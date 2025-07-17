package com.mycompany.lalitidlisachamakerprivatelimited;

public class Deep {
   
    private double deepCount;
    private Hemisphere hemisphereObject;

    public Deep(double radius, double deepCount) {
        this.deepCount = deepCount;
        hemisphereObject = new Hemisphere(radius);
    }

    public double getDeepCount() {
        return deepCount;
    }

    public void setDeepCount(double deepCount) {
        this.deepCount = deepCount;
    }

    public Hemisphere getHemisphereObject() {
        return hemisphereObject;
    }

    public void setHemisphereObject(Hemisphere hemisphereObject) {
        this.hemisphereObject = hemisphereObject;
    }

}
