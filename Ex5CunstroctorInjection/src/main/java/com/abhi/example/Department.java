package com.abhi.example;

public class Department {
	private int depcode;
	private String depname;
	
	public Department() {}

	public Department(int depcode, String depname) {
		super();
		this.depcode = depcode;
		this.depname = depname;
	}

	@Override
	public String toString() {
		return "Department [depcode=" + depcode + ", depname=" + depname + "]";
	};
	
	
}
