package com.abhi.e;

public class Product {
	private String pname;
	private int price;
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pname= " + pname + ", price= " + price + "]";
	}
	public String getPname() {
		return pname;
	}
	public int getPrice() {
		return price;
	}
}
