package com.careerit.practice.day12;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.*;


record Customer(String name, double billAmount, LocalDate dueDate) {
}

public class StringBufferExample {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       List<Customer> customerList = new ArrayList<>();
       System.out.println("Enter the number of customers:");
       int noOfCustomers = sc.nextInt();
       sc.nextLine();
       for(int i=0;i<noOfCustomers;i++){
           System.out.println("Enter the name of the customer :" +(i+1) +":");
           String name = sc.nextLine();
           System.out.println("Enter the amount for " + name + ":");
           double billAmount = sc.nextDouble();
           sc.nextLine();
           System.out.println("Enter the date for " + name + " in yyyy-MM-dd format:");
           String dueDateInput = sc.next();
           LocalDate dueDate = LocalDate.parse(dueDateInput);
           customerList.add(new Customer(name, billAmount, dueDate));
           sc.nextLine();
       }
       long startTime = System.currentTimeMillis();
       for(Customer customer:customerList){
           StringBuffer sb = new StringBuffer();
              sb.append("Dear ")
                      .append(customer.name())
                      .append(",\n")
                      .append("Your bill amount is :")
                      .append(customer.billAmount())
                      .append(" and the due date is :")
                      .append(customer.dueDate())
                      .append(".\n\n");
              System.out.println(sb.toString());
       }
       long endTime = System.currentTimeMillis();
       System.out.println("Customer details : " + customerList);
       System.out.println("Time taken for StringBuffer :"+(endTime-startTime)+"ms");
       sc.close();
    }
}
