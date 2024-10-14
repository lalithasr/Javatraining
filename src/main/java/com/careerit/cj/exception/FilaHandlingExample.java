package com.careerit.cj.exception;
import java.io.*;
import java.util.*;


public class FilaHandlingExample {
    public static void main(String[] args) {
       String filePath = "C:\\Users\\lalit\\Downloads\\abc.txt";
       File file = new File(filePath);
       try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
           String line = null;
           while((line = br.readLine()) != null){
               System.out.println(line);
           }
           }
       catch (FileNotFoundException e){
          System.out.println("File not found" + e.getMessage());
       }catch(IOException e) {
           System.out.println("Problem while reading file" + e.getMessage());
       } catch (Exception e) {
           System.out.println("Something went wrong" + e.getMessage());
       }
    }
}
