package com.abhi.example;

public class Car {
	public String carname;
	public int carprice;
	public String color;
	public Engine e;
	
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void setCarprice(int carprice) {
		this.carprice = carprice;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carname + ", carPrice=" + carprice + ", color=" + color + ", e=" + e + "]";
	}
	
	
	
}
