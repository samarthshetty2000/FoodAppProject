package com.foodapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.demo.entity.FoodOrder;
import com.foodapp.demo.responseStructure.ResponseStructure;
import com.foodapp.demo.services.FoodOrderService;


@RestController
public class FoodOrderController {
	
	@Autowired
	FoodOrderService foodOrderService;
	
	@PostMapping("/addorder/{userId}")
	public ResponseEntity<ResponseStructure<FoodOrder>> addFoodOrder(@RequestBody FoodOrder foodOrder,@PathVariable int userId) {
		
		return foodOrderService.addFoodOrder(foodOrder,userId);
		
		
	}

}
