package com.foodapp.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodapp.demo.Repository.UserRepository;
import com.foodapp.demo.dao.MenuDao;
import com.foodapp.demo.dao.UserDao;
import com.foodapp.demo.entity.Menu;
import com.foodapp.demo.entity.User;
import com.foodapp.demo.responseStructure.ResponseStructure;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	MenuDao menuDao;
	
	public ResponseEntity<ResponseStructure<User>>  addUser(User user) {
		ResponseStructure<User>  responseStructure=new ResponseStructure<User>();
		
		if(user.getRole().equals("BranchManager")) {
			Menu menu=new Menu();
			menu.setUser(user);
			menu=menuDao.addMenu(menu);
			user.setMenu(menu);
			
		}
		responseStructure.setData(userDao.addUser(user));
		responseStructure.setMessage("Success");
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<User>> (responseStructure,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<User>> login(User user){
		User loginUser=userDao.login(user.getEmail(),user.getPassword());
		if(loginUser==null) {
			ResponseStructure<User>  responseStructure=new ResponseStructure<User>();
			responseStructure.setMessage("Login failed");
			responseStructure.setStatusCode(HttpStatus.BAD_REQUEST.value());
			return new ResponseEntity<ResponseStructure<User>> (responseStructure,HttpStatus.BAD_REQUEST);
			
		}
		ResponseStructure<User>  responseStructure=new ResponseStructure<User>();
		responseStructure.setData(loginUser);
		responseStructure.setMessage("Login Success");
		responseStructure.setStatusCode(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<User>> (responseStructure,HttpStatus.ACCEPTED);
		
		
	}
	
	public List<User> getUsers(){
		return userDao.getUsers();
	}
	
	
}
