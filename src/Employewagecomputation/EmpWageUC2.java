package Employewagecomputation;

public class EmpWageUC2 {
                                         //Employee Daily Wages
	public static void main(String[] args) {
		//Print Welcome To EmpWageComputation Program
		 System.out.println("Welcome to Employee Wage Computation Program");
	     //Check Employee Is Present Or Absent
	             //Constants
		      int ATTENDANCE = 1;
	              int IS_FULL_TIME = 1;
	              int EMP_RATE_PER_HOUR = 20;
	              //Variable
	                int empHrs = 0;
	                int empWage = 0;

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
	          }
	  }