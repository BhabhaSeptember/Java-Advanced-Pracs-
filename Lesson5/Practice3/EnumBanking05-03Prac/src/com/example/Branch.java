/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example;

/**
 *
 * @author User
 */
public enum Branch {

    CPT("Basic"), PMB("Loan"), DURBAN("Full"), JHB("Full");

    String serviceLevel;

    private Branch(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }
}
