package com.foodapp.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.demo.Repository.UserRepository;
import com.foodapp.demo.dao.UserDao;
import com.foodapp.demo.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public User addUser(User user) {
		return userDao.addUser(user);
	}
	
	public List<User> getUsers(){
		return userDao.getUsers();
	}
	
	
}
