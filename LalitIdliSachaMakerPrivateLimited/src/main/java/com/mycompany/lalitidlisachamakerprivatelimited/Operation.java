
package com.mycompany.lalitidlisachamakerprivatelimited;


public class Operation {
    
    private TrayRack trayRackObject;
    
    public Operation(double rackHeight , double rackRadius , double trayRadius , double deepRadius , double trayCount , double deepCount)
    {
       trayRackObject = new  TrayRack(rackHeight,rackRadius,trayRadius,deepRadius , trayCount , deepCount);
    }

    public TrayRack getTrayRackObject() {
        return trayRackObject;
    }

    public void setTrayRackObject(TrayRack trayRackObject) {
        this.trayRackObject = trayRackObject;
    }
    
    public double getRackVolume()
    {
        return trayRackObject.getRackObject().getRackObject().getCylinderVolume();
    }
    public double getTrayArea()
    {
        return trayRackObject.getTrayObject().getTrayObject().getAreaOfCircle();
    }
    
    public double getDeepVolume()
    {
        return trayRackObject.getTrayObject().getDeepObject().getHemisphereObject().getHemisphereVolume();
    }
    
    
}
