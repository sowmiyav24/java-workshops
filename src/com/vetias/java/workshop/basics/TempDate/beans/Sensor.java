package workshop.basics.TempDate.beans;

public class Sensor {
    private int sensorId;
    private String name;
    private double temperature;

    public void setName(String aName){
        name=aName;
    }

    public String getName(){
        return name;
    }
}