package com.vetias.java.workshop.basics.stream;

import java.util.Arrays;

public class AscendingDecendingOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 4};
        System.out.println("Ascending Order:");
        Arrays.stream(numbers)
                .sorted()
                .forEach(System.out::println);
        System.out.println("Descending Order:");
        Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);
    }

}
