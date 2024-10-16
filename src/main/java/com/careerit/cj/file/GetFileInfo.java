package com.careerit.cj.file;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        if(file.exists()){
            System.out.println("File exists");
        System.out.println("File name : " + file.getName());
        System.out.println("File path : " + file.getAbsolutePath());
        System.out.println("File exists : " + file.exists());
        System.out.println("File is directory : " + file.isDirectory());
        System.out.println("File is file : " + file.isFile());
        System.out.println("File is hidden : " + file.isHidden());
        System.out.println("File can read : " + file.canRead());
        System.out.println("File can write : " + file.canWrite());
        System.out.println("File length : " + file.length());
        } else {
            System.out.println("File does not exist");
        }
        // Read the file numbers.txt and print the content of the file
    }
}
