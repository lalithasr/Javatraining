package com.careerit.cj.day15.transientexample;

import java.io.*;

public class TransientExample {

    public static void main(String[] args) {
        User user = new User("Venkat", "venky");
        String fileName = "user.ser";
        //Serialization which displays the data in the form of bytes
       /* try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(user);
            System.out.println("User object is serialized : " + user);
        } catch (IOException e) {
            e.printStackTrace();
        } */

        //Deserialization which hides the data
         try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("Deserialized user : " + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
