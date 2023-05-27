package com.gl.department;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return "HR Departmenr";
	}
	
	public String getTodaysWork() {
		return "Fill today's Marksheet and mark your attendence ";
	}
	
	public String getWorkDeadLine() {
		return "Complete by EOD";
	}
		public String doActivity() {
			return "team Lunch";
		}
			public String isTodayAHoliday() {
				return "Today is not a Holiday";
			
		
	}
}
