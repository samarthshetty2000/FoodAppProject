package com.foodapp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String address;
	private int phoneNumber;
	private String email;
	@ManyToOne
	User user;
	
	

	public Branch(int id, String name, String address, int phoneNumber, String email, User user) {

		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.user = user;
	}
	
	

	public Branch() {

	}
	
	

	
	public int getId() {
		return id;
	}
	
	

	public void setId(int id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	

	public String getAddress() {
		return address;
	}
	

	public void setAddress(String address) {
		this.address = address;
	}
	

	public int getPhoneNumber() {
		return phoneNumber;
	}

	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
