/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ariyo_6;

/**
 *
 * @author taiwoariyo
 */

          // Program Medical Records

// 1. Create the class Patient with the fields
// 2. Create the constructor and initialize the fields
// 3. Create the accessor methods for each field
// 4. Create the mutator methods for each field
// 5. Create the class Procedure and add the fields
// 6. Create the constructor, accessor and mutator methods
// 7. Create the Main program
// 8. Create an instance of Patient class and initialize it with the sample data
// 9. Create three instances of the Procedure class and initialize them
// 10. Display the information about the patient, the procedure, and total charges

// Import Simple date format class
import java.text.SimpleDateFormat;

// Import Date class
import java.util.Date;

public class Ariyo_61 {
    
// Create the Patient class with the required fields
    public static class Patient {
        private String firstName; // Field for the first name
        private String middleName; // Field for the middle name
        private String lastName; // Field for the last name
        private String address; // Field for the address name
        private String city; // Field for the city
        private String state; // Field for the state
        private String zipCode; // Field for the zip code
        private String phoneNumber; // Field for the phone number
        private String emergencyContactName; // Field for the emergency contact's name
        private String emergencyContactNumber; // Field for the emergency contact's number
        
// Create the constructor for the Patient class and initialize them
        public Patient(String firstName, String middleName, String lastName,
                       String address, String city, String state, String zipCode,
                       String phoneNumber, String emergencyContactName, String emergencyContactNumber) {
            
            // Initialize the constructor fields
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.phoneNumber = phoneNumber;
            this.emergencyContactName = emergencyContactName;
            this.emergencyContactNumber = emergencyContactNumber;
        }
        
// Create the accessor methods for each of the fields in Patient class
        public String getFirstName() {
            return firstName; // Accessor Method for firstName
        }
        
        public String getMiddleName() {
            return middleName; // Accessor Method for middleName
        }

        public String getLastName() {
            return lastName; // Accessor Method for lastName
        }

        public String getAddress() {
            return address; // Accessor Method for address
        }

        public String getCity() {
            return city; // Accessor Method for city
        }

        public String getState() {
            return state; // Accessor Method for state
        }

        public String getZipCode() {
            return zipCode; // Accessor Method for zipCode
        }

        public String getPhoneNumber() {
            return phoneNumber; // Accessor Method for phoneNumber
        }

        public String getEmergencyContactName() {
            return emergencyContactName; // Accessor Method for emergencyContactName
        }

        public String getEmergencyContactNumber() {
            return emergencyContactNumber; // Accessor Method for emergencyContactNumber
        }
        
// Create the mutator method for each of the fields in Patient class
        public void setFirstName(String firstName) {
            this.firstName = firstName; // Mutator Method for firstName
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName; // Mutator Method for middleName
        }

        public void setLastName(String lastName) {
            this.lastName = lastName; // Mutator Method for lasttName
        }

        public void setAddress(String address) {
            this.address = address; // Mutator Method for address
        }

        public void setCity(String city) {
            this.city = city; // Mutator Method for city
        }

        public void setState(String state) {
            this.state = state; // Mutator Method for state
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode; // Mutator Method for zipCode
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber; // Mutator Method for phoneNumber
        }

        public void setEmergencyContactName(String emergencyContactName) {
            this.emergencyContactName = emergencyContactName; // Mutator Method for emergencyContactName
        }

        public void setEmergencyContactNumber(String emergencyContactNumber) {
            this.emergencyContactNumber = emergencyContactNumber; // Mutator Method for emergencyContactNumber
        }
    }
    
// Create the Procedure class with the required fields
    public static class Procedure {
        private String procedureName; // Field for the procedureName
        private Date procedureDate; // Field for the procedureDate
        private String practitionerName; // Field for the practitionerName
        private double charge; // Field for the charge
        
// Create the constructor for the Procedure class
        public Procedure(String procedureName, Date procedureDate, String practitionerName, double charge) {
            
            // Initialize the Procedure fields
            this.procedureName = procedureName;
            this.procedureDate = procedureDate;
            this.practitionerName = practitionerName;
            this.charge = charge;
        }
        
// Create the accessor method for the Procedure class
        public String getProcedureName() {
            return procedureName; // Accessor Method for procedureName
        }

        public Date getProcedureDate() {
            return procedureDate; // Accessor Method for procedureDate
        }

        public String getPractitionerName() {
            return practitionerName; // Accessor Method for practitionerName
        }

        public double getCharge() {
            return charge; // Accessor Method for charge
        }
        
// Create the mutators methods for the Procedure class
        public void setProcedureName(String procedureName) {
            this.procedureName = procedureName; // Mutator Method for procedureName
        }

        public void setProcedureDate(Date procedureDate) {
            this.procedureDate = procedureDate; // Mutator Method for procedureDate
        }

        public void setPractitioner(String practitionerName) {
            this.practitionerName = practitionerName; // Mutator Method for practitionerName
        }

        public void setCharge(double charge) {
            this.charge = charge; // Mutator Method for charge
        }
        
// Create a getter method for the formatted date
        public String getFormattedDate() {
            SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy");
            return formatDate.format(procedureDate);
        }
    }
           
// Create the Main Program with the sample data
    public static void main(String[] args) {
        double totalCharges; // Declare and initialize totalCharges
        double charge1 = 250.00; // Declare and initialize charge for procedure 1
        double charge2 = 500.00; // Declare and initialize charge for procedure 2
        double charge3 = 200.00; // Declare and initialize charge for procedure 3
        
// Create an instance of Patient class and initialize it with the sample data
        Patient patient = new Patient(
            "Peter", "B", "Parker", 
            "20 Ingram St", "Forest Hills", "NY", "11375", 
            "734-1234", "Mary Jane", "735-5678"
        );
        
// Create three instances of the Procedure class and initialize them
        // For procedure 1
        Procedure procedure1 = new Procedure("Physical Exam", new Date(), "Dr. Irvine", charge1);
        
        // For procedure 2
        Procedure procedure2 = new Procedure("X-ray", new Date(), "Dr. Jamison", charge2);
        
        // For procedure 3
        Procedure procedure3 = new Procedure("Blood test", new Date(), "Dr. Smith", charge3);
        
// Display the information about the patient
        System.out.println("Patient Information:");
        System.out.println("Name: " + patient.getFirstName() + " " + patient.getMiddleName() + " " + patient.getLastName());
        System.out.println("Address: " + patient.getAddress() + ", " + patient.getCity() + ", " + patient.getState() + " " + patient.getZipCode());
        System.out.println("Phone: " + patient.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient.getEmergencyContactName() + " (" + patient.getEmergencyContactNumber() + ")");
        System.out.println();
        
// Display information about each procedure
        // For Procedure 1
        System.out.println("Procedure #1");
        System.out.println("Procedure name: " + procedure1.getProcedureName());
        System.out.println("Date: " + procedure1.getFormattedDate());
        System.out.println("Practitioner: " + procedure1.getPractitionerName());
        System.out.println("Charge: $" + procedure1.getCharge());
        System.out.println();
        
        // For Procedure 2
        System.out.println("Procedure #2");
        System.out.println("Procedure name: " + procedure2.getProcedureName());
        System.out.println("Date: " + procedure2.getFormattedDate());
        System.out.println("Practitioner: " + procedure2.getPractitionerName());
        System.out.println("Charge: $" + procedure2.getCharge());
        System.out.println();

        // For Procedure 3
        System.out.println("Procedure #3");
        System.out.println("Procedure name: " + procedure3.getProcedureName());
        System.out.println("Date: " + procedure3.getFormattedDate());
        System.out.println("Practitioner: " + procedure3.getPractitionerName());
        System.out.println("Charge: $" + procedure3.getCharge());
        System.out.println();

// Display the total charges
        totalCharges = procedure1.getCharge() + procedure2.getCharge() + procedure3.getCharge();
        System.out.printf("\nTotal Charges of the three procedures is: $%.2f\n", totalCharges);
    }
} 