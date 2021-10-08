package com.abhi.example;

public class Employee {
	private int empcode;
	private String empname;
	private int salary;
	
	
	public Employee() {}


	public Employee(int empcode, String empname, int salary) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", empname=" + empname + ", salary=" + salary + "]";
	};
	
	
}
