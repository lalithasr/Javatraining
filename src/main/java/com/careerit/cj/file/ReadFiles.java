package com.careerit.cj.file;

import java.io.File;
import java.util.Scanner;

public class ReadFiles {

    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            // Read the file numbers.txt and print the content of the file
        } catch (Exception e) {
            System.out.println("Problem while reading file");
            e.printStackTrace();
        }
        // Read the file numbers.txt and print the content of the file
    }
}
