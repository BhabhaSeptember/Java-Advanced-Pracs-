/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author User
 */
public class Manager extends Employee {

    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    
    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.println("Dept Name        : "  + getDeptName());
    }
    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }
}
