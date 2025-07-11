package com.vetias.java.workshop.basics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkSort {
    public static void main(String[] args) {
        List<Integer>marks= new ArrayList();
        marks.add(98);
        marks.add(91);
        marks.add(75);
        marks.add(89);
        marks.add(87);
        System.out.println("original marks:" + marks);
        Collections.sort(marks);
        System.out.println("Marks in ascending order:"+marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println("Marks in decending order:"+marks);
    }

}
