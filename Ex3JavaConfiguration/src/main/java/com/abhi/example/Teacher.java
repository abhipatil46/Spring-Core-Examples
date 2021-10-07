package com.abhi.example;

public class Teacher {
	private String tName;
	private int salary;
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void addTeacher(String tName,int salary) {
		this.tName=tName;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Teacher [tName=" + tName + ", salary=" + salary + "]";
	}
	
	
}
