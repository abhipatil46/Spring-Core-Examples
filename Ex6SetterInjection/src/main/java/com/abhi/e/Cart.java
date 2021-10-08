package com.abhi.e;

import java.util.Arrays;

public class Cart {
	private int cardid;
	private String customername;
	private String[] products;
	
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	@Override
	public String toString() {
		return "Cart [cardid= " + cardid + ", customername= " + customername + ", products= " + Arrays.toString(products)
				+ "]";
	}
	public void setProducts(String[] products) {
		this.products = products;
	}
	
	
}
