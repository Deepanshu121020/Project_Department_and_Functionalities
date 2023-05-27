package com.gl.main;

import com.gl.department.AdminDepartment;
import com.gl.department.HrDepartment;
import com.gl.department.TechDepartment;

public class Main {
public static void main(String[] args) {
	AdminDepartment admindepartment = new AdminDepartment();
	System.out.println("Welcome to : "+ admindepartment.departmentName());
	System.out.println(admindepartment.getTodaysWork());
	System.out.println(admindepartment.getWorkDeadLine());
	System.out.println(admindepartment.isTodayAHoliday());

	HrDepartment hrdept = new HrDepartment();
	System.out.println("Welcome to : "+ hrdept.departmentName());
	System.out.println(hrdept.getTodaysWork());
	System.out.println(hrdept.getWorkDeadLine());
	System.out.println(hrdept.doActivity());
	System.out.println(hrdept.isTodayAHoliday());
	TechDepartment techdept = new TechDepartment();
	System.out.println("Welcome to : "+ techdept.departmentName());
	System.out.println(techdept.getTodaysWork());
	System.out.println(techdept.getWorkDeadLine());
	System.out.println(techdept.getTechStackInformation());
	System.out.println(techdept.isTodayAHoliday());
}
}