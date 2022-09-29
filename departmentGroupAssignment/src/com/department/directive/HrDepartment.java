package com.department.directive;

import com.department.structure.SuperDepartment;

//HrDepartment is extending SuperDepartment.

public class HrDepartment extends SuperDepartment{
	
	//HrDepartment contains four methods of return type String and is not accept any parameter.
	
	public String departmentName() {
		return "Hr Department";                                           //overrides the departmentName().
	}
		
	public String getTodaysWork() {
		return "Fill today's timesheet and mark you attendance";          //overrides the getTodaysWork().
	}
		
	public String getWorkDeadline() {
		return "Complete by EOD";                                         //overrides the getWorkDeadline().
	}
	
	public String doActivity() {
		return "team Lunch";                                              //overrides the doActivity().
	}
}
