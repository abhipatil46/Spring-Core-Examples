package com.abhi.exmple;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	
	public void addEmployee(int empId, String empName,int salary) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	public void showEmployee() {
		System.out.println(empId+"\t "+empName+"\t "+salary);
	}
}
