package com.careerit.cj.day4;

import java.util.Scanner;


public class VariablesClass {
    int studentID;
    String studentname;
    String studentemail;
    float studentfee;
    char studentgrade;
    String StudentComments;
    boolean isStudentActive;
    long studentphone;
    double studentmarks;

    public void show() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Student Name : " + studentname);
        System.out.println("Student Email : " + studentemail);
        System.out.println("Student Fee : " + studentfee);
        System.out.println("Student Grade : " + studentgrade);
        System.out.println("Student Comments : " + StudentComments);
        System.out.println("Is Student Active : " + isStudentActive);
        System.out.println("Student Phone : " + studentphone);
        System.out.println("Student Marks : " + studentmarks);
    }

    public static void main(String[] args) {
        VariablesClass obj = new VariablesClass();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the student ID : ");
            obj.studentID = sc.nextInt();
            System.out.println("Enter the student name : ");
            obj.studentname = sc.next();
            System.out.println("Enter the student email : ");
            obj.studentemail = sc.next();
            System.out.println("Enter the student fee : ");
            obj.studentfee = sc.nextFloat();
            System.out.println("Enter the student grade : ");
            obj.studentgrade = sc.next().charAt(0);
            System.out.println("Enter the student comments : ");
            obj.StudentComments = sc.next();
            System.out.println("Enter the student phone : ");
            obj.studentphone = sc.nextLong();
            System.out.println("Enter the student marks : ");
            obj.studentmarks = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter the correct data type.");
        } finally {
            sc.close();
        }

        obj.show();
    }
}