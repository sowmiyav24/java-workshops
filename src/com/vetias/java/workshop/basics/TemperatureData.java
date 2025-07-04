package workshop.basics;

public class TemperatureData {

    public static void main(String[] args) {
        TemperatureSensor value = new TemperatureSensor(23.8f);
        System.out.println(value.getReading());
    }

}


