package Ariyo_4a;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author taiwoariyo
 */

                        // Program Bug Calculator


// 1. Declare and initialize the variables bugs for each day and daily bugs
// 2. Create a for loop to compute for the seven days
// 3. Ask user to input the number of bugs for each day
// 4. Sum up the total number of bugs
// 5. Display the total number of bugs


// Import Scanner
import java.util.Scanner;

public class Ariyo_P1b {
    public static void main(String[] args) {
        
// Create scanner object
        Scanner scan = new Scanner(System.in);
        
// Declare and initialize the variables dailybugs, day, totalBugs
            int dailyBugs;
            int day;
            int totalBugs = 0;
        
// Create the for loop to compute for the seven days
            
            for (day = 1; day <= 7; day++) {
                
// Ask the user to input the number of bugs collected for each day
                System.out.print("Enter the number of bugs for day " + day + ":");
                dailyBugs = scan.nextInt();
                
// Use combined assigment operator for computing sum of bugs collected
                totalBugs += dailyBugs;
                    
            }
// Display the total number of bugs
                System.out.println("The total number of bugs collected for 7 days is: " + totalBugs);
    }
}
