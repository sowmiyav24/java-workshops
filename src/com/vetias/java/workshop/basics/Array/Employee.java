package workshop.basics.Array;

import java.util.Arrays;

public class Employee {
  public static void main(String[] args) {
    
        String[][] employees=new String[4][2];
        employees[0][0]="10023";
        employees[0][1]="23,000";
        employees[1][0]="10024";
        employees[1][1]="23,500";
        employees[2][0]="10025";
        employees[2][1]="24,000";
        employees[3][0]="10026";
        employees[3][1]="24,500";
    for(String [] employeesStrings : employees){
            System.out.println(Arrays.toString(employeesStrings));

        }
    }
}
