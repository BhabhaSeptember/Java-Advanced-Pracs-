package com.example;

public class EmployeeTest {

    public static void main(String[] args) throws InvalidOperationException {

        Employee e1 = new Employee(0, "Bob", "Brown", 1250.50f);
        Employee e2 = new Employee(1, "Harry", "Potter", 1250.50f);
        Employee e3 = new Employee(5, "Harry", "Potter", 1250.50f);

        Employee e4 = new Employee(1, "Harry", "Styles", 1250.50f);
        EmployeeImpl emp = new EmployeeImpl();

        //Adding
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
//        emp.add(e4); //Test: adding existent emp id
//
//
        //Deleting
        emp.delete(5);
//        emp.delete(3); //Test: deleting non existen emp id
//
//
        //FindById
        System.out.println("Find By Id: ");
        System.out.println("Found: " + emp.findById(0) + "\n");
//        System.out.println("Found: " + emp.findById(3) + "\n"); //Test: finding non existent emp id
//        System.out.println("Found: " + emp.findById(20)); //Test: ArrayIndexOutOfBounds

        Employee[] allEmps = emp.getAllEmployees();
        for (Employee employee : allEmps) {
            System.out.println(employee + "\n");
        }
    }

}
