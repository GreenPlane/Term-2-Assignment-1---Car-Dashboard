public class Dashboard {

    private int odometer;
    private int speedometer;
    private boolean checkEngine;
   
    public Dashboard() 
    {
        odometer = 0;
        speedometer = 0;
        checkEngine = false;
    }
    
    public Dashboard(int milesTravelled, int speed)
    {
      boolean checkMiles = false;
      boolean checkSpeed = false;
        
      if(milesTravelled >= 0 && milesTravelled <= 99999)
      {
        odometer = milesTravelled;
        checkMiles = true;
      }
      else
      {
        odometer = 0;
      }
      
      if(speed >= 0 && speed <= 100)
      {
        speedometer = speed;
        checkSpeed = true;
      }
      else
      {
        speedometer = 0;
      }
      
      if(checkMiles == true && checkSpeed == true)
      {
          checkEngine = false;
      }
      else
      {
          checkEngine = true;
      }
      
    }

    public void accelerate() 
    {
      this.speedometer++;
      if(this.speedometer > 100)
      {
        this.speedometer = 0;
        this.checkEngine = true;
      }
    }

    public void drive(int numMinutes) 
    {
      double mph = (double)this.speedometer/60;
      double totalMiles = mph * numMinutes;
      this.odometer += (int)totalMiles;
      if(this.odometer > 99999)
      {
        this.odometer = 0;
        this.checkEngine = true;
      }
      
    }
    
    
    public String toString() 
    {
      String prt = null;
      prt = "Speedometer: " + speedometer + " MPH\n" + "Odometer: ";
      
      if(odometer >= 0 && odometer <= 9)
      {
        prt = prt + "0000";
      }
      else if(odometer >= 10 && odometer <= 99)
      {
        prt = prt + "000";
      }
      else if(odometer >= 100 && odometer <= 999)
      {
        prt = prt + "00";
      }
      else if(odometer >= 1000 && odometer <= 9999)
      {
        prt = prt + "0";
      }
      else
      {
        prt = prt;
      }
      
      prt = prt + odometer + "\n";
      
      
      if(checkEngine == true)
      {
        prt = prt + "Check Engine: On";
      }
      else
      {
        prt = prt + "Check Engine: Off";
      }
      
      return prt;
    }

    

    

}
