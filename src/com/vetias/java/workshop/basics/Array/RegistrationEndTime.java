package workshop.basics.Array;

import java.time.LocalTime;

public class RegistrationEndTime {

    public static void main(String[] args) {

        LocalTime CurrentTime = LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(18,59,59);
        int hoursleft = registrationEndTime.getHour()-CurrentTime.getHour();
        int minutesleft = registrationEndTime.getMinute()-CurrentTime.getMinute();
        int secondsleft= registrationEndTime.getSecond()-CurrentTime.getSecond();
        System.out.println("You have" + hoursleft + "hoursleft and " + minutesleft + "minutesleft and "+ secondsleft + "secondsleft");
        
        
    }
}
