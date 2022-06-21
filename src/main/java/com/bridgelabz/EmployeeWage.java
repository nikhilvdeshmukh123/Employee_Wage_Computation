package com.bridgelabz;
/*
 * @author: Nikhil Deshmukh
 * Calculate Wages till a condition of total working hours or days is reached for a month
 * - Assume wage per Hour is 20, - Assume Full Day Hour is 8
 * - Assume Part time Hour is 4, - Assume 100 hours and 20 Working Day per Month
 */
public class EmployeeWage {
    // static constant variables
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int NUM_OF_WORKING_DAYS = 20;
    static final int MAX_HRS_IN_MONTH = 100;

    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        // Local variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        // Condition of total working hours or days reach
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
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
            totalEmpHrs += empHrs;
            // Calculating Daily Employee Wage
            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Working Day: " + totalWorkingDays + " Employee Working hrs: " + empHrs);
            System.out.println("Daily Employee Wage: " + empWage);
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage for a Month: " + totalEmpWage);
    }
}