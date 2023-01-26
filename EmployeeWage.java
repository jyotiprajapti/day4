package com.day4;
import java.lang.Math;
public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
         double x = Math.random();
         if(x>=0.5) {
        	 System.out.println("employee is present");
        	 
         }
         else {
        	 System.out.println("employee is absent");
         }
         
         int wagePerHour =20;
		 int fullDay = 8;
		 int dailyWage = (wagePerHour*fullDay);
		 System.out.println("Daily employee Wage is  " + dailyWage);
		}
	}
	


