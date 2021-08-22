package com.biryanivibes.repository;

import org.springframework.data.repository.CrudRepository;

import com.biryanivibes.model.CartItem;

public interface CartItemsRepository  extends CrudRepository<CartItem, Integer>{

}
