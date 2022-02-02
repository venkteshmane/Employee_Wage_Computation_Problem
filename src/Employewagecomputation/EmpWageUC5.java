package Employewagecomputation;

public class EmpWageUC5 {
	                 // Employee Wages for Month
		public static final int IS_PART_TIME = 1;
	     public static final int IS_FULL_TIME = 2;
	     public static final int EMP_RATE_PER_HR = 20;
	     public static final int NUM_OF_WORKING_DAYS = 2;

	     public static void main(String[] args) {
	//Print Welcome To EmpWageComputation Program
		 System.out.println("Welcome to Employee Wage Computation Program");
	//Check Employee Is Present Or Absent
	             //Constants
		       int ATTENDANCE = 1;
	               int IS_FULL_TIME = 1;
	               int IS_PART_TIME = 2;
	               int EMP_RATE_PER_HOUR = 20;
	              //Variable
	                int empHrs = 0;
	                int empWage = 0;
	                int totalEmpWage = 0;

	             //Computation
	              double empCheck = Math.floor(Math.random() * 10) % 2;
	              if (empCheck == ATTENDANCE)
	                    System.out.println("Employee is Present");
	              else
	                    System.out.println("Employee is Abscent");
	//Calculate Daily Employee Wage
	              if (empCheck == IS_FULL_TIME)
	                    empHrs = 8;
	              else
	                    empHrs = 0;
	              empWage = empHrs * EMP_RATE_PER_HOUR;
	              System.out.println("Daily EmpWage: " +empWage);
	//Add Part time Employee Wage
	                //Computation
	                double empCheck1 = Math.floor(Math.random() * 10) % 3;
	                if (empCheck1 == IS_PART_TIME)
	                        empHrs = 4;
	                else if (empCheck1 == IS_FULL_TIME)
	                        empHrs = 8;
	                else
	                        empHrs = 0;
	                empWage = empHrs * EMP_RATE_PER_HOUR;
	                System.out.println("Part Time Employee Wage: " +empWage);
	//Using Switch Stmt Calculate Employee Wage
	                //Computation
	                int empCheck2 = (int) Math.floor(Math.random() * 10) % 3;
	                switch (empCheck2) {
	                    case  2:
	                        empHrs = 4;
	                        break;
	                     case 1:
	                        empHrs = 8;
	                        break;
	                      default:
	                        empHrs = 0;
	                }
	                empWage = empHrs * EMP_RATE_PER_HOUR;
	                System.out.println("Emp-Wage: " +empWage);
	//Calculate Wage For Month
	                //Computation
	                 for(int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
	                   int empCheck3 = (int) Math.floor(Math.random() * 10) % 3;
	                    switch (empCheck3) {
	                       case  2:
	                        empHrs = 4;
	                        break;
	                       case  1:
	                        empHrs = 8;
	                        break;
	                       default:
	                        empHrs = 0;
	                }
	                   empWage = empHrs * EMP_RATE_PER_HOUR;
	                   totalEmpWage = totalEmpWage + empWage;
	                   System.out.println("EmpWage: " +empWage);
	         }
	         System.out.println("Month EmpWage: " + totalEmpWage);
	       }
	}