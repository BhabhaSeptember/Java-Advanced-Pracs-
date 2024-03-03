/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Employee mbali = new Employee ("Mbali Duma", "Manager", "HR", 65_000);
        Employee buli = new Employee("Buli Zondo", "Staff", "HR", 55_000);
        System.out.println("Mbali's witholding = R" + mbali.getWithholding() +
                "\nand Bonus = R" + mbali.getBonus());
       
        System.out.println("\nBuli's withholding = R" + buli.getWithholding() + 
                "\nand Bonus = R" + buli.getBonus());
    }
    
}
