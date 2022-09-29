package com.department.directive;

import com.department.structure.SuperDepartment;

//TechDepartment is extending SuperDepartment.

public class TechDepartment extends SuperDepartment{
	
	//TechDepartment contains four methods of return type String and is not accept any parameter.
	
	public String departmentName() {
		return "Tech Department";                                         //overrides the departmentName().
	}
			
	public String getTodaysWork() {
		return "Complete coding of module 1";                             //overrides the getTodaysWork().
	}
			
	public String getWorkDeadline() {
		return "Complete by EOD";                                         //overrides the getWorkDeadline().
	}
		
	public String getTechStackInformation() {
		return "core Java";                                               //getTechStackInformation().
	}
}
