package com.bridgelabz;
/*
 * @author: Nikhil Deshmukh
 * Solving using Switch Case Statement
 * - Assume wage per Hour is 20, - Assume Full Day Hour is 8
 * - Assume Part time Hour is 8
 */
public class EmployeeWage {
    // static constant variables
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        // Local variables
        int empHrs = 0;
        int empWage = 0;
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
        System.out.println("Daily Employee Wage: " + empWage);
    }
}