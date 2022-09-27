package com.foodapp.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodapp.demo.Repository.FoodOrderRepository;
import com.foodapp.demo.entity.FoodOrder;

@Component
public class FoodOrderDao {
	@Autowired
	FoodOrderRepository foodOrderRepository;
	public FoodOrder addOrder(FoodOrder foodOrder) {
		return foodOrderRepository.save(foodOrder);
	}
	
	public List<FoodOrder> getAllFoodOrder(){
		return foodOrderRepository.findAll();
	}
	
	public FoodOrder getFoodOrderById(int id) {
		Optional<FoodOrder> optional=foodOrderRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		else
			return null;
		
	}
	
	public String deleteFoodOrder(int id) {
		Optional<FoodOrder> optional=foodOrderRepository.findById(id);
		if (optional.isPresent()) {
			foodOrderRepository.delete(optional.get());
			return "Food order of id:" +id +" deleted";
		}
		return "Food order of id:" +id +" does not exist";
	}
	
	

} 
