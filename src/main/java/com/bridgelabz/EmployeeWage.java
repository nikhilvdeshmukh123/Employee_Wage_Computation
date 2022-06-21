package com.bridgelabz;

/*
 * @author: Nikhil Deshmukh
 * Check Employee is Present or Absent
 * -Use ((RANDOM)) for Attendance Check
 */
public class EmployeeWage {
    // Main method
    public static void main(String[] args) {
        // Displaying welcome message
        System.out.println("Welcome to Employee Wage Computation Program");
        // Variable
        int isPresent = 1;
        // Random function to generate number
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
        // Checking employee is present or not
        if (empCheck == isPresent) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
