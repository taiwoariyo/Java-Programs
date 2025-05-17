package Ariyo_4a;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author taiwoariyo
 */

                        // Program Tuition increase


// 1. Declare and initialize the variable and constants tuition, annualRate, year
// 2. Create the for loop to compute tuition rise for 8 years
// 3. Compute the tuition rise per year
// 4. Display the total tuition rise per year


public class Ariyo_P3 {
    public static void main(String[] args) {
        
// Declare and initialize the variable and constants tuition, annualRate, year
        
        double TUITION = 15000.0;
        double ANNUALRATE = 0.05;
        int year;
        
// Create the for loop to compute tuition rise for 8 years
        for (year = 1; year <= 8; year++) {
            
// Compute the tuition rise per year
            TUITION += TUITION * ANNUALRATE;
            
// Display the total tuition rise per year 
            System.out.printf("The projected semester tuition amount for year %d: $%.2f%n", year, TUITION);
              
        }
    }
}
