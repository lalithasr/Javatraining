package com.careerit.practice.day14;
import java.util.*;


public class EmployeeManager {

        public static void main(String[] args) {
            Employee emp1 = new Employee(1001, "Krish", "Manager", 45000);
            Employee emp2 = new Employee(1002, "Manoj", "Developer", 35000);
            Employee emp3 = new Employee(1003, "Charan", "Tester", 25000);
            Employee emp4 = new Employee(1004, "Sai", "Manager", 45000);
            Employee emp5 = new Employee(1005, "Rajesh", "Developer", 35000);
            Employee emp6 = new Employee(1006, "Ravi", "Tester", 25000);
            List<Employee> empList = List.of(emp1, emp2, emp3, emp4, emp5, emp6);

            emp1.showInfo();
            emp2.showInfo();
            emp3.showInfo();
            emp4.showInfo();
            emp5.showInfo();
            emp6.showInfo();

            for(Employee emp : empList){
                if(emp.salary > 50000){
                    emp.salary = emp.salary + emp.salary * 0.3;
                } else if(emp.salary > 30000){
                    emp.salary = emp.salary + emp.salary * 0.5;
                } else {
                    emp.salary = emp.salary + emp.salary * 0.8;
                }
            }

            for(Employee emp : empList){
                emp.showInfo();
                System.out.println("-".repeat(30));
            }
        }

}
