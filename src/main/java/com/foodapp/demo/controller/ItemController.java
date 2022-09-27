package com.foodapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.demo.entity.Item;
import com.foodapp.demo.responseStructure.ResponseStructure;
import com.foodapp.demo.services.ItemServices;

@RestController
public class ItemController {
	
	@Autowired
	ItemServices itemService;
	
	@PostMapping("additem/{foodOrderID}")
	public ResponseEntity<ResponseStructure<Item>> addItem(@RequestBody Item item ,@PathVariable int foodOrderID){
		
		return itemService.addItem(item, foodOrderID);
		
	}

}
