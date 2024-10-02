package com.careerit.cj.day23_Userinput.student;

import com.careerit.cj.day15.modifiers.Student;

import java.util.Scanner;

public class StudentRegistration {

    String name;
    String email;
    String phone;
    String course;
    double fee;
    float duration;

    public void registerStudent(String name, String email, String phone, String course, double fee, float duration) {

        System.out.println("Student is registered with below details:");
        System.out.println("Name of the student is: " + name + "\n Email of the student is: " + email + "\n Phone number of the student is: " + phone + "\n Course of the student is: " + course + "\n Fee of the student is: " + fee + "\n Duration of the course is: " + duration + " years");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("Enter the email of the student:");
        String email = sc.nextLine();
        System.out.println("Enter the phone number of the student:");
        String phone = sc.nextLine();
        System.out.println("Enter the course of the student:");
        String course = sc.nextLine();
        System.out.println("Enter the fee of the student:");
        double fee = sc.nextDouble();
        System.out.println("Enter the duration of the course:");
        float duration = sc.nextFloat();
        StudentRegistration obj = new StudentRegistration();
        obj.registerStudent(name, email, phone, course, fee, duration);
    }
}
