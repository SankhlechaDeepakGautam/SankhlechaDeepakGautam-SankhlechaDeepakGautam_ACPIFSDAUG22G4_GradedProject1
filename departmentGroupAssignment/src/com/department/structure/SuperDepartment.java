package com.department.structure;

//Super Class is SuperDepartment as per the problem statement.

public class SuperDepartment {
 
	//Super department contains four methods of return type String and is not accept any parameter.
	
	public String departmentName() {
		return "Super Department";       //returns the Super Department.
	  }

public String getTodaysWork() {
	return "No Work as of now";          // returns the No work as of now.
      }

public String getWorkDeadline() {
	return "Nil";                        // returns the Nil.
     }

public String isTodayAHoliday() {
	return "Today is not a Holiday";      //returns the Today is not a Holiday
    }
}