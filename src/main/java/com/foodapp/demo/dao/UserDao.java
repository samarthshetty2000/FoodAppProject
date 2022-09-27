package com.foodapp.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodapp.demo.Repository.UserRepository;
import com.foodapp.demo.entity.User;

@Component
public class UserDao {
	private static final Optional<User> User = null;
	@Autowired
	UserRepository userRepository ;
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	 public void deleteUsers(int id) {
		 userRepository.deleteById(id);
	 }
	 
	 public User getUserById(int id) {
		 Optional<User> user=userRepository.findById(id);
		 return user.get();
		
	 }



	public User login(String email, String password) {
		
		return userRepository.findByEmailAndPassword(email, password) ;
	}

}
