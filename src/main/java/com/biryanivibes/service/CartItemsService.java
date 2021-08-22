package com.biryanivibes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biryanivibes.model.CartItem;
import com.biryanivibes.model.Food;
import com.biryanivibes.repository.CartItemsRepository;

@Service
public class CartItemsService {
	
	@Autowired
	CartItemsRepository cartItemsRepository;
	
	@Autowired
	FoodService service;
	
	 public void addCartItem(CartItem cartItem) {
		 
		 
		 cartItem.setTotalItemPrice(
				 
			 cartItem.getQuantity() *service.getFoodPrice(cartItem.getFoodId().getId()));
		 cartItemsRepository.save(cartItem);
	    }

}
