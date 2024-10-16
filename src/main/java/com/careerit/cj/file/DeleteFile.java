package com.careerit.cj.file;

import java.io.File;

public class DeleteFile {

        public static void main(String[] args) {
            File file = new File("numbers.txt");
            if(file.exists()){
                file.delete();
                System.out.println("File deleted successfully");
            } else {
                System.out.println("File does not exist");
            }
        }
}
