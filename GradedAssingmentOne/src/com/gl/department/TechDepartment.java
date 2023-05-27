package com.gl.department;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return "Tech Departmenr";
	}
	
	public String getTodaysWork() {
		return "Complete code of module 1 ";
	}
	
	public String getWorkDeadLine() {
		return "Complete by EOD";
	}
		public String getTechStackInformation() {
			return "core Java";
			}
		public String isTodayAHoliday() {
			return "Today is not a Holiday";
		}
}