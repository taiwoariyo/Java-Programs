/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ariyo_Taiwo_HW3;

/**
 *
 * @author taiwoariyo
 */

                        // Program Mass and Weight
// Algorithm

// 1. Declare the variables mass, g(acceleration due to gravity), weight
// 2. Initialize the constant g
// 3. Ask user to input the mass
// 4. Calculate the weight
// 5. Format the weight to fixed-point notation
// 6. Compute the if statement for weight > 2500 and weight < 150


// Import Scanner
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ariyo_P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0Newtons");
    
 // Declare the variables mass, g(acceleration due to gravity), weight
        double mass;
        double g = 9.80; // Initialize the constant g
        double weight;
        double maxWeight = 2500;
        double minWeight = 150;
        
 // Ask user to input the mass
        System.out.print("Enter the mass of the object (in kg): ");
        mass = scan.nextDouble();
        
 // Calculate the weight
        weight = mass * g;
        
 // Format the weight to fixed-point notation
        String formatweight = df.format(weight);
    
 // Compute the if statement for weight > 2500 and weight < 150
        if (weight > maxWeight) {
            System.out.println("The object is too heavy");
        } else if (weight < minWeight) {
            System.out.println("The object is too light");
        } else {
            System.out.println("The object weight is: " + formatweight);
        }
        
    }
}