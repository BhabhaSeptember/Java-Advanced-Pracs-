/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

import com.example.domain.Employee;
/**
 *
 * @author User
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new Employee();
        
        emp.setEmpId(1);
        emp.setName("Judith Ngwenya");
        emp.setSsn("012-32-4321");
        emp.setSalary(150_000.00);
        
        System.out.println("Employee id     : " + emp.getEmpId());
        System.out.println("Employee name   : " + emp.getName());
        System.out.println("Employee SSN    : " + emp.getSsn());
        System.out.println("Employee salary : R" + emp.getSalary());
    }
    
}
