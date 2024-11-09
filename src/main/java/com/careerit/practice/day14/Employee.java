package com.careerit.practice.day14;

public class Employee {
    private long empno;
    private String name;
    private String job;
    public double salary;

    public Employee(long empno, String name, String job, double salary){
        this.empno = empno;
        this.name = name;
        this.job = job;
        this.salary = salary;
    }


    public void showInfo(){
        System.out.println("Empno : "+empno);
        System.out.println("Name : "+name);
        System.out.println("Job : "+job);
        System.out.println("Salary : "+salary);
    }

}
