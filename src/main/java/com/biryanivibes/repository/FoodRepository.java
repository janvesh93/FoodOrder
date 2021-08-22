package com.biryanivibes.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.biryanivibes.model.Food;

public interface FoodRepository extends CrudRepository<Food, Serializable> {
	
	
	
	

}
