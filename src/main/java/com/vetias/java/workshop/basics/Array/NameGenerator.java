package com.vetias.java.workshop.basics.Array;

import java.util.Scanner;

public class NameGenerator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= scanner.nextLine();
        System.out.println("Enter your gender:");
        String gender= scanner.nextLine();
        System.out.println("Enter your qualification:");
        String qualification= scanner.nextLine();
        if("male".equals(gender)){
            System.out.println("Mr");
        }
        else if("female".equals(gender)){
            System.out.println("Miss");
        }
        else{
            System.out.println("hello");
        }
        scanner.close();

        }
        

    }
