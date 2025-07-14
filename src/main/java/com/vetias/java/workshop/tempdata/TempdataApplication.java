package com.vetias.java.workshop.tempdata;

import java.time.LocalDate;

import com.vetias.java.workshop.tempdata.beans.Organization;

public class TempdataApplication {
    public static void main(String[] args) {
        // TemperatureSensor temperatureSensor = new TemperatureSensor(18.5f);
        // float reading = temperatureSensor.getReading();
        // System.out.println(reading);
        Organization organization = new Organization("Vetias","Thindai","www.vetias.com","veias.ac.in","1235678900" );
        System.out.println(organization);
        

    }
}
