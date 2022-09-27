package com.foodapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.demo.entity.FoodOrder;
import com.foodapp.demo.entity.FoodProduct;
import com.foodapp.demo.entity.User;
import com.foodapp.demo.responseStructure.ResponseStructure;
import com.foodapp.demo.services.FoodOrderService;
import com.foodapp.demo.services.FoodProductService;
import com.foodapp.demo.services.UserService;

@RestController
public class DemoController {
	
	
	
	
	@Autowired
	FoodProductService foodProductService;
	
	

	
	
	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return"Hello";
	}
	
	

	@PostMapping("/addproduct/{id}")
	public ResponseEntity addFoodProduct(@RequestBody FoodProduct foodProduct,@PathVariable int id) {
		
		foodProductService.add(foodProduct,id);
		return new ResponseEntity<>(foodProduct,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getproducts")
	public ResponseEntity getproducts() {

		return new ResponseEntity<>(foodProductService.getProducts(),HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
	
}
