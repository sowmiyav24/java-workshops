package com.vetias.java.workshop.basics.collection;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Shanthi");
        name.add("Keerthi");
        name.add("Venkatesh");
        name.add("Sowmi");
        for(int i=0;i<name.size();i++){
            System.out.println(name);
        }
        
    }

}

