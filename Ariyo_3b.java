/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ariyo_5;

/**
 *
 * @author taiwoariyo
 */

// Program Reverse Digits (Without Functions)

// 1. Declare the variables number, reverse, digit
// 2. Ask user to enter the number
// 3. Create a loop that reverses the number
// 5. Display the reversed number

// Import Scanner
import java.util.Scanner;

public class Ariyo_3b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
// Declare the variables number, reverse, digit
        int number;
        int reverse;
        int digit;
        reverse = 0; // Initialize reverse
// Ask user to enter the number
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        
// Create a loop that reverses the number
        while (number != 0) {
            digit = number % 10;  // Compute the last digit of the number
            reverse = reverse * 10 + digit;  // Compute the place values and add the last digit at the end
            number = number / 10;  // Integer division to handle the last digit
    }
        
// Display the reversed number
        System.out.println("The Reversed Number is: " + reverse);
    }    
}