package com.vetias.java.workshop.basics.stream;

import java.util.ArrayList;
import java.util.List;

public class NameStream {
    public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Shathi");
    names.add("Sowmi");
    names.add("Keerthi");
    names.add("Sanjay");
    names.add("Sita");
    names.stream()
    .filter(name ->name.startsWith("K")|| name.startsWith("K"))
    .distinct().map(String::toUpperCase).forEach(System.out::println);
    }
}
