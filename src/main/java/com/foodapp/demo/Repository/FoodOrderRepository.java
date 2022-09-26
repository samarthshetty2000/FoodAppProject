package com.foodapp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.demo.entity.FoodOrder;

@Repository
public interface FoodOrderRepository  extends JpaRepository<FoodOrder,Integer>{
	
	

}
