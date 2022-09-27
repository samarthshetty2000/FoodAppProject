package com.foodapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.demo.entity.FoodProduct;
import com.foodapp.demo.responseStructure.ResponseStructure;
import com.foodapp.demo.services.FoodProductService;

@RestController
public class FoodProductController {
	
	@Autowired
	FoodProductService foodProductService;
	
	@PostMapping("/addproduct/{user id}")
	public ResponseEntity<ResponseStructure<FoodProduct>> addproduct(@RequestBody FoodProduct foodProduct ,@PathVariable userId){
		
		return foodProductService.add(null, 0)
		
	}

}
