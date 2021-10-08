package com.abhi.example;

public class Maneger {
	private Employee emp;
	private Department dep;
	
	public Maneger() {}

	public Maneger(Employee emp, Department dep) {
		super();
		this.emp = emp;
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Maneger [enp=" + emp + ", dep=" + dep + "]";
	};
	
}
