package com.vetias.java.workshop.basics.collection;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Integer>rollnos= new HashSet<>();
        rollnos.add(1002);
        rollnos.add(1003);
        rollnos.add(1004);
        rollnos.add(1009);
        rollnos.add(1002);
        rollnos.add(1005);
        rollnos.add(1007);
        System.out.println(rollnos);
    }

}
