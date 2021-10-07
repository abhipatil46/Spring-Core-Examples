package com.abhi.example;

import java.util.Scanner;

public class Student {
	private int studId;
	private String studName;
	private int marks;
	Scanner sc=new Scanner(System.in);
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	public void getStudent(int studId,String studName,int marks ) {
		this.studId=studId;
		this.studName=studName;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", marks=" + marks + "]";
	}
	
	
	
	
}
