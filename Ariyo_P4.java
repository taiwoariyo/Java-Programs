package Ariyo_4a;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author taiwoariyo
 */


                        // Program Factorial of a number


// 1. Declare initialize the integer number and factorial
// 2. Create a while loop to get the nonnegative integer only
// 3. Ask the user to enter a nonnegative integer number
// 4. Confirm the input to be valid for nonnegative integers only
// 5. Create the for loop to compute the factorial of the integer number
// 6. Compute the factorial of the integer number
// 7. Display the factorial of the integer number


// Import Scanner
import java.util.Scanner;

public class Ariyo_P4 {
    public static void main(String[] args) {
        
// Create scanner object
        Scanner scan = new Scanner(System.in);
        
// Declare initialize the integer number and factorial
        int intNumber;
        long factorial = 1;
        
// Create a while loop to get the nonnegative integer only
        while (true){
            
// Ask the user to enter a nonnegative integer number
            System.out.println("Enter a nonnegative integer:");
            intNumber = scan.nextInt();
            
// Confirm the input to be valid for nonnegative integers only 
            if (intNumber < 0) {
                System.out.println("Please enter a nonnegative integer:");
                
            } else {
                
// Create a while loop to compute the factorial of the integer number
                for (int i =1; i <= intNumber; i++) {
                    
// Compute the factorial of the integer number
                    factorial *= i;
                    
                }
                
// Display the factorial of the integer number  
                System.out.println("The factorial of " + intNumber + " is: " + factorial);
                
// Break the loop 
                break;
                  
            }
             
        }
        
        }  
        
    }