package com.foodapp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.demo.entity.FoodProduct;


@Repository
public interface  FoodProductRepository extends JpaRepository<FoodProduct, Integer> {

}
