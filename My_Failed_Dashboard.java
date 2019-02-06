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
        String pntOdo = "";
        int digits = 0;
        for (int i = odo; i > 10; i/=10){
            digits++;
        }
        for (int i = 0; i < 5 - digits; i++){
            pntOdo = pntOdo + "0";
        }
        if (odo != 0) {
            pntOdo = pntOdo + String.valueOf(odo);
        }
        return "Speedometer: " + speedo + " MPH\n" + "Odometer: " + pntOdo + "\n" + "Check Engine: " + pntCheckEngine;
    }
}
