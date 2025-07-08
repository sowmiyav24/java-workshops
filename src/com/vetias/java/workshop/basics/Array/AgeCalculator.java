package workshop.basics.Array;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your birthofyear:");
    int birthofyear =scanner.nextInt();
    int currentyear=2025;
    int age=birthofyear-currentyear;
    System.out.println("your age"+age );

}
}

