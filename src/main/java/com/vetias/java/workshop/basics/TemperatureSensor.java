package com.vetias.java.workshop.basics;

import com.vetias.java.workshop.basics.Array.Sensor;

public class TemperatureSensor implements Sensor {
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public TemperatureSensor(float aTemperature){
        temperature = aTemperature; 
    }

    public float getReading(){
        return temperature;
    }
}
