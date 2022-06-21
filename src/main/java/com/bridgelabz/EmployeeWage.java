package com.bridgelabz;
/*
 * @author: Nikhil Deshmukh
 * Calculate Daily Employee Wage
 * - Assume wage per Hour is 20, - Assume Full Day Hour is 8
 */
public class EmployeeWage {
    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        // Variables
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        // Local variables
        int empHrs = 0;
        int empWage = 0;
        // Random function to generate number 1 or 0
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
        // Checking Employee is present or not
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Employee is Present");
        } else {
            empHrs = 0;
            System.out.println("Employee is Absent");
        }
        // Calculating Employee Wage
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Daily Employee Wage: " + empWage);
    }
}
