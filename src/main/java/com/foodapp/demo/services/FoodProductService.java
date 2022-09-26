package com.foodapp.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.demo.Repository.FoodProductRepository;
import com.foodapp.demo.dao.FoodProductDao;
import com.foodapp.demo.entity.FoodProduct;

@Service
public class FoodProductService {
	
	
	@Autowired
	FoodProductDao  foodProductDao;
	
	public void add(FoodProduct foodProduct) {
		foodProductDao.add(foodProduct);
	}
	
	
	public List<FoodProduct > getProducts(){
		return foodProductDao.getProducts();
	}

}
