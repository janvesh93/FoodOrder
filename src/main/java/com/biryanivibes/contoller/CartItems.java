package com.biryanivibes.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.biryanivibes.model.CartItem;
import com.biryanivibes.model.Food;
import com.biryanivibes.service.CartItemsService;

@RestController
public class CartItems {
	
	@Autowired
	CartItemsService cartItemsService;
	
	@RequestMapping(value= "/addCart", method = RequestMethod.POST)
	@ResponseStatus
	public void addFood2(@RequestBody CartItem cartItem) {
		
		
		cartItemsService.addCartItem(cartItem);
	}
	

}
