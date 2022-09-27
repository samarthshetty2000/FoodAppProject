package com.foodapp.demo.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int totalPrice;

	private Date orderCreatedTime;
	private Date orderDeliveryTime;

	private String customerName;
	private long contactNumber;

	@ManyToOne
	@JoinColumn
	@JsonIgnore
	User user;
	
	
	
//	@OneToMany(mappedBy="foodOrder",cascade=CascadeType.ALL)
//	List<Item> itemList;
//
//	public List<Item> getItemList() {
//		return itemList;
//	}
//
//	public void setItemList(List<Item> itemList) {
//		this.itemList = itemList;
//	}
//	
	
	
	

	public FoodOrder(int id, int totalPrice, Date orderCreatedTime, Date orderDeliveryTime, String customerName,
			long contactNumber, User user) {

		this.totalPrice = totalPrice;
		this.orderCreatedTime = orderCreatedTime;
		this.orderDeliveryTime = orderDeliveryTime;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.user = user;
	}

	public FoodOrder() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderCreatedTime() {
		return orderCreatedTime;
	}

	public void setOrderCreatedTime(Date orderCreatedTime) {
		this.orderCreatedTime = orderCreatedTime;
	}

	public Date getOrderDeliveryTime() {
		return orderDeliveryTime;
	}

	public void setOrderDeliveryTime(Date orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	@Override
	public String toString() {
		return "FoodOrder [id=" + id + ", totalPrice=" + totalPrice + ", orderCreatedTime=" + orderCreatedTime
				+ ", orderDeliveryTime=" + orderDeliveryTime + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", user=" + user + "]";
	}

}
