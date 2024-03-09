/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class ExceptionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       try {
           System.out.println("Reading from file: " + args[0]);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("No file specified. Quitting...");
           System.exit(1);
       }
       
       
       try(BufferedReader b = new BufferedReader(new FileReader(args[0]));) {
       String s = null;
       while( (s = b.readLine())  !=null ) {
           System.out.println(s);
    }
       } catch(FileNotFoundException e) {
           System.out.println("File not found: " + args[0]);
           System.exit(1);
       } catch(IOException e) {
           System.out.println("Error reading file: " + e.getMessage());
           System.exit(1);
       }


    }
    
}
