package com.example;

public class Employee {

    private String name;
    private String role;
    private String dept;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String role, String dept, double salary) {
        this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    
    
    
    public class  BenefitsHelper {
       private final double bonusRate = 0.02;
       private final double withholdingRate = 0.07;
       
       protected double calcBonus(double salary) {
           return salary * getBonusRate();
       }
       
       protected double calcWithholding(double salary) {
           return salary * getWithholdingRate();
       }

        /**
         * @return the bonusRate
         */
        public double getBonusRate() {
            return bonusRate;
        }

        /**
         * @return the withholdingRate
         */
        public double getWithholdingRate() {
            return withholdingRate;
        }

       
    }
    
    public double getWithholding() {
        return helper.calcWithholding(salary);
    }
    
    public double getBonus() {
        return helper.calcBonus(salary);
    }
    
    private BenefitsHelper helper = new BenefitsHelper();
    
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

}


