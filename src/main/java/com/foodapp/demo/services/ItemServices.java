package com.foodapp.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodapp.demo.dao.FoodOrderDao;
import com.foodapp.demo.dao.ItemDao;
import com.foodapp.demo.entity.FoodOrder;
import com.foodapp.demo.entity.Item;
import com.foodapp.demo.responseStructure.ResponseStructure;

@Service
public class ItemServices {
	@Autowired
	ItemDao itemDao;
	
	@Autowired
	FoodOrderDao foodOrderDao;
	
	
	
	
	public ResponseEntity<ResponseStructure<Item>> addItem(Item item,int FoodOrderId) {
		FoodOrder foodOrder =  foodOrderDao.getFoodOrderById(FoodOrderId);

		item.setFoodOrder(foodOrder);
	
		ResponseStructure<Item> responseStructure=new ResponseStructure<Item>();
		responseStructure.setData(itemDao.addItem(item));
		responseStructure.setMessage("Item Added");
		responseStructure.setStatusCode(HttpStatus.ACCEPTED.value());
		 
		return new ResponseEntity<ResponseStructure<Item>> (responseStructure,HttpStatus.ACCEPTED) ;
	}
	
	
	
	
	
	

}
