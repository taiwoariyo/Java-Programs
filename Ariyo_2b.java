/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ariyo_5;

/**
 *
 * @author taiwoariyo
 */

// Program Coin Tossing (Without Functions)

// 1. Declare and initialize the variables heads, tails, and tosses
// 2. Create a random object for the simulation
// 3. Create a loop that simulates 100 coin tosses
// 4. Display the results of the simulation

// Import Random
import java.util.Random;

public class Ariyo_2b {
    public static void main(String[] args) {
        Random rand = new Random(); // Create the random object
        
// Declare and initialize the variables outcome, heads, tails, and tosses
        int outcome;
        int heads = 0;
        int tails = 0;
        int tosses = 100;
        
// Create a loop that simulates 100 coin tosses
        for (int i = 0; i < tosses; i++) {
            outcome = rand.nextInt(2);  // Random object to return 0 for Tails or 1 for Heads

            if (outcome == 1) {
                System.out.println("Heads");
                heads++;  // Increment the heads 
            } else {
                System.out.println("Tails");
                tails++;  // Increment the tails 
            }
        }
        
// Display the results of the simulation
        System.out.println("\nThe outcome of the simulation is:");
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}