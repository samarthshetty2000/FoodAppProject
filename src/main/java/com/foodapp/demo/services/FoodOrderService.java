package com.foodapp.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.foodapp.demo.dao.FoodOrderDao;
import com.foodapp.demo.dao.UserDao;
import com.foodapp.demo.entity.FoodOrder;
import com.foodapp.demo.entity.Item;
import com.foodapp.demo.entity.User;
import com.foodapp.demo.responseStructure.ResponseStructure;


@Component
public class FoodOrderService {

	@Autowired
	FoodOrderDao foodOrderDao;
	
	
	@Autowired
	UserDao userDao;
	
	
	public ResponseEntity<ResponseStructure<FoodOrder>> addFoodOrder(FoodOrder foodOrder,int userid) {
		
		User user = userDao.getUserById(userid);
		foodOrder.setUser(user);
		ResponseStructure<FoodOrder> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.ACCEPTED.value());
		responseStructure.setMessage("Food Order Placed");
		FoodOrder foodOrder1=foodOrderDao.addOrder(foodOrder);
		System.out.println(foodOrder1);
		responseStructure.setData(foodOrder1);
		return new  ResponseEntity<ResponseStructure<FoodOrder>>(responseStructure,HttpStatus.ACCEPTED);
	}
	


}
