package com.vetias.java.workshop.basics.string;

public class WordCount {
     public int count(String inputString){
        int count=0;
        if(inputString != null && !inputString.isEmpty()){
        String[]word=inputString.split(" ");
        count=word.length;
       
        }
         return count;
    }
}