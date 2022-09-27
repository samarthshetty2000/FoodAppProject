
package com.foodapp.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int productId;
	private String name;
	@ManyToOne
	@JoinColumn
	FoodOrder foodOrder;
	int price;
	int Quantity;
	String type;
	
	
	public Item() {
	
		
	}
	
	
	
	


	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FoodOrder getFoodOrder() {
		return foodOrder;
	}
	public void setFoodOrder(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}



	public Item(int id, int productId, String name, FoodOrder foodOrder, int price, int quantity, String type) {
		super();
		this.id = id;
		this.productId = productId;
		this.name = name;
		this.foodOrder = foodOrder;
		this.price = price;
		Quantity = quantity;
		this.type = type;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getQuantity() {
		return Quantity;
	}



	public void setQuantity(int quantity) {
		Quantity = quantity;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return "Item [id=" + id + ", productId=" + productId + ", name=" + name + ", foodOrder=" + foodOrder + "]";
	}
	

}
