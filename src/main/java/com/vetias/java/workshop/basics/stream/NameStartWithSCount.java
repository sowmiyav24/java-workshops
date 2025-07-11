package com.vetias.java.workshop.basics.stream;

import java.util.ArrayList;
import java.util.List;

public class NameStartWithSCount {

public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Shathi");
    names.add("Sowmi");
    names.add("Keerthi");
    names.add("Sanjay");
    names.add("Sita");

    long nameCount = names.stream()
    .filter(name -> name.startsWith("S")).count();

    System.out.println(nameCount);
}

}
