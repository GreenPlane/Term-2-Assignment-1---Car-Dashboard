/** Code doesn't work, will edit.
**/

public class Dashboard {
    private int odo;
    private int speedo;
    private boolean checkEngine;
    private String pntCheckEngine;
    private String pntOdo;

    public Dashboard (){
        odo = 0;
        speedo = 0;
        checkEngine = false;
        pntCheckEngine = "Off";
    }

    public Dashboard(int milesTravelled, int speed){
        falseCheckEngine();
        if (milesTravelled >= 0 && milesTravelled <= 99999){
            odo = milesTravelled;
        }
        else{
            odo = 0;
            checkEngine = true;
        }
        if (speedo >= 0 && speedo <= 100){
            speedo = speed;
        }
        else{
            speedo = 0;
            checkEngine = true;
        }
        isCheckEngine();
    }

    public void accelerate (){
        speedo++;
        if (speedo > 100) {
            speedo = 0;
            checkEngine = true;
        }
        isCheckEngine();
    }

    public void drive (int numMinutes){
        odo += speedo * (numMinutes / 60);
        if (odo > 99999){
            checkEngine = true;
            odo = 0;
        }

        isCheckEngine();
    }

    public void falseCheckEngine(){
        pntCheckEngine = "Off";
    }

    public void isCheckEngine() {
        if (checkEngine == true){
            pntCheckEngine = "On";
        }
    }

    public String toString (){
        return "Speedometer: " + speedo + " MPH\n" + "Odometer: " + odo + "\n" + "Check Engine: " + pntCheckEngine;
    }
}
