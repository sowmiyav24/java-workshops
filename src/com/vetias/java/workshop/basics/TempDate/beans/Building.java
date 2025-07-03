package workshop.basics.TempDate.beans;

import java.time.LocalDateTime;

public class Building {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime openDate;
    private LocalDateTime closseDateTime;
    private String description;



    public void setName(String aName){
        name=aName;
    }

    public String getName(){
        return name;
    }
}