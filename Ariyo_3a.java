/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ariyo_5;

/**
 *
 * @author taiwoariyo
 */

// Program Reverse Digits (With Functions)

// 1. Declare the variables number, reverse, digit, and returnReverse
// 2. Create the function to reverse the number
// 3. Create a loop to reverse the number
// 4. Ask user to input the number
// 5. Display the reversed number

// Import Scanner
import java.util.Scanner;

public class Ariyo_3a {
    
// Create the function to reverse the number
    public static int reversed(int number) {
        int reverse;
        int digit;
        reverse = 0; // Initialize reverse
        
// Create a loop to reverse the number
        while (number != 0) {
            digit = number % 10;  // Compute the last digit of the number
            reverse = reverse * 10 + digit;  // Compute the place values and add the last digit at the end
            number = number / 10;  // Integer division to handle the last digit
        }
        
        return reverse;
    }

// Ask user to input the number
    public static void main(String[] args) {
        int number;
        int returnReverse;
        Scanner scan = new Scanner(System.in); // Create scanner object
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        
// Call the reversed function to compute the reverse
        returnReverse = reversed(number);
        
        
// Display the reversed number
       System.out.println("The Reversed Number is: " + returnReverse);  
    }
}