package com.vetias.java.workshop.basics.stream;

import java.util.Arrays;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks = {90,98,78,34,100};
        long numberOfsubjects= Arrays.stream(marks)
        .filter(mark -> mark > 40)
        .count();
        System.out.println(numberOfsubjects);
        }

}
