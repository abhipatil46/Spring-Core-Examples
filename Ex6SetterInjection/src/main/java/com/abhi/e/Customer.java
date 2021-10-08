package com.abhi.e;

public class Customer {
	private String cusname;
	private int cusid;
	private String city;
	
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCusname() {
		return cusname;
	}

	@Override
	public String toString() {
		return "Customer [cusname= " + cusname + ", cusid= " + cusid + ", city= " + city + "]";
	}
	
	
	
}
