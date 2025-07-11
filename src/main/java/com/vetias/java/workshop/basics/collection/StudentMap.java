package com.vetias.java.workshop.basics.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1001, "Sowmiya");
        students.put(1007,"nandhini") ;
        students.put(1005, "supree");
        students.put(1002, "keerthi");
         students.put(1008,"varni") ;
        students.put(1009, "kani");
        students.put(1003, "harishitha");
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }

}
