package com.department.driver;

import com.department.directive.AdminDepartment;
import com.department.directive.HrDepartment;
import com.department.directive.TechDepartment;

//Driver Class Main is used to create Objects of All Mentioned Departments.
public class Main {
	
	public static void main(String[] args) {
		
		AdminDepartment adminDepartment = new AdminDepartment();               //Creating AdminDepartment Object.
		
		System.out.println("Welcome to "+adminDepartment.departmentName());
		
		//Printing Results of All Methods and Display all it's functionality.
		
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();

		HrDepartment hrDepartment = new HrDepartment();                       //Creating HrDepartment Object.
		
		System.out.println("Welcome to "+hrDepartment.departmentName());
		
		//Printing Results of All Methods and Display all it's functionality.
		
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println();
		
		TechDepartment techDepartment = new TechDepartment();                 //Creating TechDepartment object.
		
		System.out.println("Welcome to "+techDepartment.departmentName());
		
		//Printing Results of All Methods and Display all it's functionality.
		
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		}
}
