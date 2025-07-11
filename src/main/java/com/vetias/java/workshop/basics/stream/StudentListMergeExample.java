package com.vetias.java.workshop.basics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentListMergeExample {
    public static void main(String[] args) {
        
        List<Integer> csRollNons= Arrays.asList(101,103,104,105);
        List<Integer> itRollNons= Arrays.asList(345,346,347,348);
        List<Integer> allRollNons=Stream.concat(csRollNons.stream(),itRollNons.stream()).toList();
        System.out.println(allRollNons);

    }

}
