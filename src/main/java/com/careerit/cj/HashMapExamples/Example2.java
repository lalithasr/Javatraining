package com.careerit.cj.HashMapExamples;

import java.util.HashMap;

public class Example2 {

    String name;
    int rollno;



    // 1. addStudent(int rollno,String name)
    public void addStudent(int rollno,String name){
        System.out.println("Student added with rollno: "+rollno+" and name: "+name);
    }

    public void removeStudent(int rollno){
        System.out.println("Student removed with rollno: "+rollno);
    }

    public void updateStudentName(int rollno,String name){
        System.out.println("Student updated with rollno: "+rollno+" and name: "+name);
    }

    public void getStudentName(int rollno){
        System.out.println("Student name with rollno: "+rollno);
    }




    public static void main(String[] args) {
        Example2 obj = new Example2();
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(101, "Venkat");
        map.put(102, "Manoj");
        map.put(103, "Charan");
        map.put(104, "Krish");
        map.put(105, "Lakshmi");
        map.put(106, "Lalitha");
        map.put(107, "Venkat");
        map.put(108, "Manoj");
        map.put(109, "Charan");
        System.out.println(map);
        System.out.println(map.get(101));
        System.out.println(map.get(102));
        map.remove(102);
        System.out.println(map);
        map.clear();
        System.out.println(map);
        map.put(101, "Venkat");
        map.put(102, "Lalitha");
        map.put(103, "Lakshmi");
        obj.addStudent(101, "Venkat");

    }

}
