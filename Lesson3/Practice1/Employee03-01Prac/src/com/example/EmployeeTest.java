package com.example;

import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import com.example.domain.Admin;
import com.example.domain.Director;

public class EmployeeTest {

    public static void main(String[] args) {
//        Employee emp = new Employee ();
//        emp.setEmpId(101);
//        emp.setName("Jane Smith");
//        emp.setSsn ("012-34-5678");
//        emp.setSalary(120_345.27);
//        System.out.println ("Employee id:         " + emp.getEmpId());
//        System.out.println ("Employee name:       " + emp.getName());
//        System.out.println ("Employee Soc Sec #:  " + emp.getSsn());
//        System.out.println ("Employee salary:     " + emp.getSalary());

        Engineer eng = new Engineer(2, "Jade de Lange", "123-45-6789", 140_000.30);
        Manager mgr = new Manager(3, "Fred Shezi", "234-56-7890", 200_000.00, "US Marketing");
        Admin admin = new Admin(4, "Billy Joe", "345-67-8901", 60_500.00);
        Director dir = new Director(5, "Susan Frank", "456-78-9012", 350_000.00, "Global Marketing", 10_000_000.00);
        Employee emp = new Employee();

        System.out.println("\n Engineer");
        eng.printEmployee();
        
        System.out.println("\n Manager");
        mgr.printEmployee();
    
        System.out.println("\n Administrator");
        admin.printEmployee();
        
        System.out.println("\n Director");
        System.out.println("Initial salary   : R" + dir.getSalary());
        dir.raiseSalary(500.00);
        dir.printEmployee();
        
        System.out.println("\n Employee");
        emp.setName("Barry White");
        emp.printEmployee();
        
        //Testing Validations
        System.out.println("");
        emp.setName("");
        emp.raiseSalary(-10);
        

    }
}
