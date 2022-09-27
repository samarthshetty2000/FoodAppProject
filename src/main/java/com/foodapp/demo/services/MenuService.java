package com.foodapp.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodapp.demo.dao.MenuDao;
import com.foodapp.demo.entity.Menu;
import com.foodapp.demo.responseStructure.ResponseStructure;

@Service
public class MenuService {
	
	@Autowired
	MenuDao menuDao;
	
	public ResponseEntity<ResponseStructure<Menu>> addMenu(Menu menu){
		ResponseStructure<Menu> responseStructure=new  ResponseStructure<Menu> ();
		responseStructure.setData(menuDao.addMenu(menu));
		responseStructure.setMessage("Success");
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<Menu>>(responseStructure,HttpStatus.CREATED);
		
	}
	

}
