package com.biryanivibes.contoller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.biryanivibes.model.Food;
import com.biryanivibes.service.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	@RequestMapping(value= "/foodList", method = RequestMethod.GET)
	public List<Food> foodList() {
		
		
		return foodService.retriveFoodList();
	}
	
	
	@RequestMapping(value= "/addFood", method = RequestMethod.POST)
	public void addFood(@RequestBody Food food) {
		
		
		 foodService.addFood(food.getName(),food.getCategory(),food.getPrice());
	}
	
	@RequestMapping(value= "/addFood2", method = RequestMethod.POST)
	//@ResponseStatus
	public void addFood2(@RequestBody Food food) {
		
		System.out.println("Hello addFood Controller");
		 foodService.addFood2(food);
	}
	
	
	@RequestMapping(value="getFood/{id}")
	public float getFoodPrice(@PathVariable int id) {
		
		
		
		return foodService.getFoodPrice(id);
	}
	
	
	@RequestMapping(value= "/deleteFood", method = RequestMethod.POST)
	public void deleteFood(@RequestBody String name) {
		
		
		 foodService.deleteFood(name);
	}
	
}
