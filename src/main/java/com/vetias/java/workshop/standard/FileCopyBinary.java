package com.vetias.java.workshop.standard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBinary {
    public static void main(String[] args) {
        try(FileInputStream inputStream=new FileInputStream("foodie.jpg");
            FileOutputStream outputStream=new FileOutputStream("foodie.jpg"))
            {
                byte[] chunk = new byte[1024];
                int byteRead;
                while ((byteRead=inputStream.read(chunk)) !=-1) {
                        outputStream.write(chunk,0,byteRead);

                }         
            } catch (IOException e) {
                System.out.println("Error in reading or writing the file");
                
            } 
    }

}  
