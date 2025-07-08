// package workshop.basics.Array;

// import java.util.Scanner;

// public class AgeCalculator {
//     public static void main(String[] args) {
        
//     // Scanner scanner=new Scanner(System.in);
//     // System.out.println("Enter your birthofyear:");
//     // int birthofyear =scanner.nextInt();
//     // int currentyear=2025;
//     // int age=currentyear-birthofyear;
//     // System.out.println("your age:"+age );

// }
// }


package workshop.basics.Array;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator{
    public static void main(String[] args) {
        System.out.println("Enter your Date of Birth:(YYYY-MM-DD)");
        String birthofyear = input Scanner.nextLine();
        LocalDate birthdate= LocalDate.parse(birthofyear);
        int birthdate=birthdate.getYear();
    int currentyear=LocalDate.now (). getyear();
    }
}  