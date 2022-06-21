package com.bridgelabz;
/*
 * @author: Nikhil Deshmukh
 * Calculating Wages for a Month
 * - Assume wage per Hour is 20, - Assume Full Day Hour is 8
 * - Assume Part time Hour is 8, - Assume 20 Working Day per Month
 */
public class EmployeeWage {
    // static constant variables
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int NUM_OF_WORKING_DAYS = 20;

    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        // Local variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            // Random function to generate number
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            // Checking Employee is Part time or full time present
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Employee is Part Time Present");
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Employee is Full Time Present");
                    break;
                default:
                    empHrs = 0;
                    System.out.println("Employee is Absent");
            }
            // Calculating Daily Employee Wage
            empWage = empHrs * EMP_RATE_PER_HOUR;
            // Calculating monthly Employee Wage
            totalEmpWage = empWage + totalEmpWage;
            System.out.println("Daily Employee Wage: " + empWage);
        }
        System.out.println("Total Employee Wage for Month: " + totalEmpWage);
    }
}