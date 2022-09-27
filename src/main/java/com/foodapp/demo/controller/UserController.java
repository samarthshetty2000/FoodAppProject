package com.foodapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.demo.entity.User;
import com.foodapp.demo.responseStructure.ResponseStructure;
import com.foodapp.demo.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/adduser")
	public ResponseEntity<ResponseStructure<User>> addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/getusers")
	public ResponseEntity getUsers() {

		return new ResponseEntity<>(userService.getUsers(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<ResponseStructure<User>> login(@RequestBody User user){
		return userService.login(user);
		
	}
	
	

}
