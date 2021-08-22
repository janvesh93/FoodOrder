package com.biryanivibes.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	  private int quantity;
	  
	  @OneToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "food_id", referencedColumnName = "id")
	  private Food food;
	  private double totalItemPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Food getFoodId() {
		return food;
	}
	public void setFoodId(Food foodId) {
		this.food = foodId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotalItemPrice() {
		return totalItemPrice;
	}
	public void setTotalItemPrice(double totalItemPrice) {
		this.totalItemPrice = totalItemPrice;
	}
	  
	  
	  
	  
}
