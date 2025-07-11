package com.vetias.java.workshop.basics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddSolitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,12,13,14,56,32,21);
        Map<Boolean,List<Integer>> groupedMap = numbers.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));
       System.out.println( groupedMap.get(true));
       System.out.println( groupedMap.get(false));
    }
}




