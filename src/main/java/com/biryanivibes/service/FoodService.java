package com.biryanivibes.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biryanivibes.model.Food;
import com.biryanivibes.repository.FoodRepository;





@Service
public class FoodService {
	
	 private static List<Food> foods = new ArrayList<Food>();
	 @Autowired
	 FoodRepository foodRepository;
	 private static int foodCount = 3;
	  static {
	      //  foods.add(new Food(1,"Chicken Dum Biryani","Biryani's",(float)10.99));
	       // foods.add(new Food(2,"Special Chicken Biryani","Biryani's",(float)11.99));
	      //  foods.add(new Food(3,"Carrot Halwa","Dessert",(float)3.99));
	    }
	    
	  
	  public List<Food> retriveFoodList(){
		  List<Food> foodList = new ArrayList<Food>();
		 foodRepository.findAll().forEach(food->foodList.add(food));;
	    
	        return foodList;
	  }
	  
	  
/*	  public double retriveFoodPrice(int id){
		  
		  Optional<Food> result = foodRepository.findById(id);
		  Food food = result.get();
		  
	    
	    return food.getPrice();
	        
	  } */
	  
	  public void addFood(String name, String Category, float price) {
	        //foods.add(new Food(++foodCount, name, Category, price));
	    }
	  
	  public void addFood2(Food food) {
		  
		  System.out.println("Hello addFood Service");
	        foodRepository.save(food);
	    }
	  
		
		public float getFoodPrice(int id) {
			
			Optional<Food> price= foodRepository.findById(id);
			Food food=price.get();
			
			return food.getPrice();
		}
	  
	  public void deleteFood(String name) {
		  Iterator<Food> iterator = foods.iterator();
	        while (iterator.hasNext()) {
	            Food food = iterator.next();
	            if (food.getName() == name) {
	                iterator.remove();
	            }
	        }
	    }

}
