package workshop.basics;

import workshop.basics.Array.Sensor;

public class TemperatureSensor implements Sensor {
    private float temperature;

    public TemperatureSensor(float aTemperature){
        temperature = aTemperature; 
    }

    public float getReading(){
        return temperature;
    }
}
