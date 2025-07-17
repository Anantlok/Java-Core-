package com.mycompany.lalitidlisachamakerprivatelimited;

public class Validation {
    
    public String validateWhichTrayUse(Operation op)
    {
        double trayRadius=op.getTrayRackObject().getTrayObject().getTrayObject().getRadius();
        if(trayRadius==9)
        {
          double DeepCount = op.getTrayRackObject().getTrayObject().getDeepObject().getDeepCount();
          if(DeepCount>=4 && DeepCount<=6)
          {
              return "Small";
        }
        }
        else if(trayRadius==12)
        {
          double DeepCount = op.getTrayRackObject().getTrayObject().getDeepObject().getDeepCount();
          if(DeepCount>=8 && DeepCount<=10)
          {
              return "Medium";
          }
        }
         else if(trayRadius==18)
        {
          double DeepCount = op.getTrayRackObject().getTrayObject().getDeepObject().getDeepCount();
          if(DeepCount>=16 && DeepCount<=16)
          {
              return "Large";
          }
        }
        return "invalid choice";
    }
    
    public boolean validateTrayCount(Operation op) {
        double trayCount = op.getTrayRackObject().getTrayObject().getTrayCount();
        double maxTray = Limitation.maxTrayCount;
        double minTray = Limitation.miniTrayCount;
        if (1 <= trayCount || 5 >= trayCount) {
            return true;
        }
        return false;
    }

    public boolean validateRackTrackRadius(Operation op) {
        double rackRadius = op.getTrayRackObject().getRackObject().getRackObject().getRadius();
        double trayRadius = op.getTrayRackObject().getTrayObject().getTrayObject().getRadius();
        if (trayRadius>(0.70*rackRadius) && trayRadius < (0.85*rackRadius)) {
            return true;
        }
        return false;
    }
    
        public boolean validateTrayDeepArea(Operation op) {
        double trayArea = op.getTrayRackObject().getTrayObject().getTrayObject().getAreaOfCircle();
        double DeepCount = op.getTrayRackObject().getTrayObject().getDeepObject().getDeepCount();
        double DeepArea = op.getTrayRackObject().getTrayObject().getDeepObject().getHemisphereObject().getHemisphereTopArea();
        if (trayArea > (0.70*trayArea) && DeepCount * DeepArea < (0.85*trayArea)) {
            return true;
        }
        return false;
    }
        
}
