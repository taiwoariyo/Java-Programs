/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ariyo_Taiwo_HW3;

/**
 *
 * @author taiwoariyo
 */
                       
                         // Program Stadium Sitting
// Algorithm

// 1. Declare the variables classA, classB, classC, and income
// 2. Declare the variables ticketNumberA,ticketNumberB, ticketNumberC
// 3. Initialize the variables classA, classB, classC with price
// 4. Ask user for the number of tickets sold for each class 
// 5. Calculate the income from ticket sales
// 6. Format the total income to fixed-point notation
// 7. Display the total income


// Import decimal format and scanner
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ariyo_P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$#.00");
        
 // Declare the variables classA, classB, classC, and income
        double classA;
        double classB;
        double classC;
        double income;
        
 // Declare the variables ticketNumberA,ticketNumberB, ticketNumberC
        int ticketNumberA;
        int ticketNumberB;
        int ticketNumberC;
        
 // Initialize the variables classA, classB, classC with price
        classA = 25.00;
        classB = 20.00;
        classC = 15.00;
        
 // Ask user for the number of tickets sold for class A
        System.out.print("Enter the number of Class A tickets sold: ");
            ticketNumberA = scan.nextInt();

 // Ask user for the number of tickets sold for class B
        System.out.print("Enter the number of Class B tickets sold: ");
            ticketNumberB = scan.nextInt();
            
 // Ask user for the number of tickets sold for class C
        System.out.print("Enter the number of Class C tickets sold: ");
            ticketNumberC = scan.nextInt();
            
 // Calculate the income from ticket sales
        income = (classA * ticketNumberA) + (classB * ticketNumberB) 
                + (classC * ticketNumberC);
        
 // Format the total income to fixed-point notation
        String formatIncome = df.format(income);

 // Display the total income
        System.out.println("Total income generated from the ticket sales: " + formatIncome);
           
    }
}
