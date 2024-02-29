package com.example.domain;

import java.text.NumberFormat;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee() {

    }

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Please enter a valid name!");
        }
    }

    public void raiseSalary(double increase) {
        if (increase > 0) {
            salary += increase;
        } else {
            System.out.println("Salary increase must be more than R0.00");
        }
    }

    public void printEmployee() {

        System.out.println("Employee ID      :  " + getEmpId());
        System.out.println("Employee Name    :  " + getName());
        System.out.println("Employee SSN     :  " + getSsn());
        System.out.println("Employee Salary  :  " + NumberFormat.getCurrencyInstance().format((double) getSalary()));

    }

    public int getEmpId() {
        return empId;
    }

//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
    public String getSsn() {
        return ssn;
    }

//    public void setSsn(String ssn) {
//        this.ssn = ssn;
//    }
}
