package com.department.directive;

import com.department.structure.SuperDepartment;

//SuperDepartment class is superclass and all other departments are extends it.

//AdminDepartment is extending SuperDepartment.

public class AdminDepartment extends SuperDepartment{
	
	//AdminDepartment contains three methods of return type String and is not accept any parameter.
	
	public String departmentName() {
		return "Admin Department";                                        //overrides the departmentName().
	}
	
	public String getTodaysWork() {
		return "Complete your Documents Submission ";                     //overrides the getTodaysWork().
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";                                         //overrides the getWorkDeadline().
	}
}
	
