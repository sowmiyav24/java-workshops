package com.vetias.java;

import java.util.Arrays;
import java.util.Scanner;

public class PrizeSorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of prizes
        System.out.print("Enter the number of prizes: ");
        int numberOfPrizes = scanner.nextInt();

        // Create an array to store the prizes
        int[] prizes = new int[numberOfPrizes];

        // Get prize values from the user
        System.out.println("Enter the prize values:");
        for (int i = 0; i < numberOfPrizes; i++) {
            System.out.print("Prize " + (i + 1) + ": ");
            prizes[i] = scanner.nextInt();
        }

        // Sort the prizes in ascending order
        Arrays.sort(prizes);

        // Print the sorted prizes
        System.out.println("\nPrizes in ascending order:");
        for (int prize : prizes) {
            System.out.println(prize);
        }

        scanner.close();
    }
}