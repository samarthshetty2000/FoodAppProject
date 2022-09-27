package com.foodapp.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodapp.demo.Repository.FoodProductRepository;
import com.foodapp.demo.dao.FoodProductDao;
import com.foodapp.demo.dao.MenuDao;
import com.foodapp.demo.dao.UserDao;
import com.foodapp.demo.entity.FoodProduct;
import com.foodapp.demo.entity.Menu;
import com.foodapp.demo.entity.User;
import com.foodapp.demo.responseStructure.ResponseStructure;

@Service
public class FoodProductService {
	
	
	@Autowired
	FoodProductDao  foodProductDao;
	@Autowired
	UserDao userDao;
	
	@Autowired
	MenuDao menuDao;
	
	
	
	public ResponseEntity<ResponseStructure<FoodProduct>> add(FoodProduct foodProduct,int userId) {
		User user=userDao.getUserById(userId);
		if(user.getRole().equals("BranchManager")) {
			Menu menu=user.getMenu();
		    foodProduct.setMenu(menu);
		}
		
		ResponseStructure<FoodProduct> responseStructure=new ResponseStructure<FoodProduct>();
		responseStructure.setData(foodProductDao.add(foodProduct));
		
		
		
		return null;
	}
	
	
	public List<FoodProduct> getProducts(){
		return foodProductDao.getProducts();
	}
	

}
