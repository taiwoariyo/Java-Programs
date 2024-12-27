package Ariyo_4a;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author taiwoariyo
 */

                        // Program Ocean levels


// 1. Declare and initialize the variables and constants yearly ocean rise, each year, total rise, and years
// 2. Create the while loop to compute ocean rise for each year
// 3. Compute the total ocean rise per year
// 4. Display the total ocean rise per year in millimeters


public class Ariyo_P2b {
    public static void main(String[] args) {
        
// Declare and initialize the variables and constants yearly ocean rise, each year, total rise, and years 
        double YEARLYRISE = 3.5;
        double totalRise;
        int year = 1;
        int YEARS = 20;
        
// Create the while loop to compute ocean rise for each year
        while ( year <= YEARS) {
            
// Compute the total ocean rise per year
        totalRise = YEARLYRISE * year;
        
// Display the total ocean rise per year in millimeters
        System.out.println("The ocean level for Year " + year + " is: " + totalRise + " millimeters");
        
// Increment the year
         year++;
    }
        
    }
    
}