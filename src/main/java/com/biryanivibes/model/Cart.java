package com.biryanivibes.model;

import java.util.List;

public class Cart {

	
	  //@Id
	  private String id;
	  private String customerId;
	  private List<CartItem> cartItems;
	  private double totalCartPrice;
	  

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private double price;
	  
	  
	  
}
