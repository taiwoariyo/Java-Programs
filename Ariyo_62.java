/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ariyo_6;

/**
 *
 * @author taiwoariyo
 */

          // Program Employee Records

// 1. Create the Employee class with the fields
// 2. Create the first constructor and initialize the fields
// 3. Create the second constructor and make the exceptions for department and position
// 4. Create the third constructor take takes no argument
// 5. Create the mutator method for the Employee fields
// 6. Create the accessor method for the Employee fields
// 7. Create the Main program
// 8. Create three Employee objects with the sample data
// 9. Display the data for each of the three employees


public class Ariyo_62 {
    
// Create the Employee class with the required fields
    public static class Employee {
        private String name; // Field for the name
        private int idNumber; // Field for the idNumber
        private String department; // Field for the department
        private String position; // Field for the position
        
// Create the constructor with the arguments and initialize them
        public Employee(String name, int idNumber, String department, String position) {
        
            // Initialize the Employee fields
            this.name = name;
            this.idNumber = idNumber;
            this.department = department;
            this.position = position;
        }
        
// Create the constructor with arguments name and idnumber
        public Employee(String name, int idNumber) {
            this.name = name;
            this.idNumber = idNumber;
            this.department = "";
            this.position = "";
        }
    
// Create the constructor with no arguments
        public Employee() {
            this.name = "";
            this.idNumber = 0;
            this.department = "";
            this.position = "";
        }
    
// Create the mutator method for each field
        public void setName(String name) {
            this.name = name; // Mutator Method for name
        }
    
        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber; // Mutator Method for idNumber
        }

        public void setDepartment(String department) {
            this.department = department; // Mutator Method for department
        }

        public void setPosition(String position) {
            this.position = position; // Mutator Method for position
        }
    
// Create the accessor methods for each field
        public String getName() {
            return name; // Accessor Method for name
        }

        public int getIdNumber() {
            return idNumber; // Accessor Method for idNumber
        }

        public String getDepartment() {
            return department; // Accessor Method for department
        }

        public String getPosition() {
            return position; // Accessor Method for position
        }
    }
    
// Create the main program
    public static void main(String[] args) {
        
// Create three Employee objects and initialize them with the sample data
        // For Employee 1
        Employee employee1 = new Employee("Susan Meyers", 48999, "Accounting", "Vice President");
        
        // For Employee 2
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        
        // For Employee 3
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineering");
        
// Display the data for each employee
        // For employee 1
        System.out.println("Employee 1: ");
        System.out.println("Name: " + employee1.getName());
        System.out.println("ID Number: " + employee1.getIdNumber());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Position: " + employee1.getPosition());
        System.out.println();
        
        // For employee 2
        System.out.println("Employee 2: ");
        System.out.println("Name: " + employee2.getName());
        System.out.println("ID Number: " + employee2.getIdNumber());
        System.out.println("Department: " + employee2.getDepartment());
        System.out.println("Position: " + employee2.getPosition());
        System.out.println();
        
        // For employee 3
        System.out.println("Employee 3: ");
        System.out.println("Name: " + employee3.getName());
        System.out.println("ID Number: " + employee3.getIdNumber());
        System.out.println("Department: " + employee3.getDepartment());
        System.out.println("Position: " + employee3.getPosition());    
    }
}