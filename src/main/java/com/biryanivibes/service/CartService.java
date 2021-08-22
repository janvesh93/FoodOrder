package com.biryanivibes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.biryanivibes.model.CartItem;
import com.biryanivibes.model.Food;

@Service
public class CartService {
	
	private static List<CartItem> cItems = new ArrayList<CartItem>();

	 public void add(CartItem cItem) {
		 
		 cItems.add(cItem);
	        
	    }
}
