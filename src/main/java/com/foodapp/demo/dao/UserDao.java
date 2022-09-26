package com.foodapp.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodapp.demo.Repository.UserRepository;
import com.foodapp.demo.entity.User;

@Component
public class UserDao {
	@Autowired
	UserRepository userRepository ;
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	

}
