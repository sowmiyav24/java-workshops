package com.vetias.java.workshop.basics.collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Shanthi");
        name.add("Keerthi");
        name.add("Venkatesh");
        name.add("Sowmi");

        name.forEach(System.out::println);
        name.sort(Comparator.reverseOrder());
            System.out.println(name);
        }
        
}



