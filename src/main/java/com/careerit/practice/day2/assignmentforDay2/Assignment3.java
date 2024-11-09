package com.careerit.practice.day2.assignmentforDay2;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empno :");
        int empno = sc.nextInt();
        System.out.println("Enter the employee name :");
        String name = sc.next();
        System.out.println("Enter the monthly salary :");
        Long salary = sc.nextLong();
        Long yearlySalary = salary * 12;
        System.out.println("Hi " +name+"! Your employee id is "+ empno +", monthly salary is Rs "+salary+" and yearly salary is Rs "+yearlySalary);


    }
}
