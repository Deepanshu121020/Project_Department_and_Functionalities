package com.gl.department;

public class AdminDepartment extends SuperDepartment{
	public String departmentName() {
		return "Admin Departmenr";
	}
	
	public String getTodaysWork() {
		return "Complete your document Submission";
	}
	
	public String getWorkDeadLine() {
		return "Complete by EOD";
	}
		
		public String isTodayAHoliday() {
			return "Today is not a Holiday";
	}
	
}
