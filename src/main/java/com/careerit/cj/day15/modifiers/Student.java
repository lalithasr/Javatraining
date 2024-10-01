package com.careerit.cj.day15.modifiers;

public class Student {

    private int rollno;
    private String name;
    private String course;
    private double fee;

    public Student(int rollno, String name, String course, double fee) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    public void showDetails() {
        System.out.println("Rollno: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Fee: " + fee);
    }

    public void payFee(double amount) {
        if (amount < 0) {
            System.out.println("Amount should be greater than 0");
            return;
        }
        fee -= amount;
        System.out.println("Fee paid successfully, remaining fee is :" + fee);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Student s1 = new Student(1001, "Venkat", "Java", 25000);
        s1.showDetails();
        obj.study();
    }
}
