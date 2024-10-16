package com.careerit.cj.file;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            if(file.exists()){
                System.out.println("File already exists");
                return;
            } else {
                file.createNewFile();
                System.out.println("File created successfully");
                }
            } catch (IOException e) {
            System.out.println("Problem while creating file");
            e.printStackTrace();
        }
    }
}
