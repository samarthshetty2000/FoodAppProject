package com.foodapp.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodapp.demo.Repository.FoodProductRepository;
import com.foodapp.demo.entity.FoodProduct;




@Component
public class FoodProductDao {
	@Autowired
	FoodProductRepository  foodProductRepository;
	
	public void add(FoodProduct foodProduct) {
	
		foodProductRepository.save(foodProduct);
	}
	
	public List<FoodProduct > getProducts(){
		return foodProductRepository.findAll();
	}
	
	public void deleteByProductId(int id) {
		foodProductRepository.deleteById(id);
	}
}
