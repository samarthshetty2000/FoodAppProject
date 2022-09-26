package com.foodapp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.demo.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer>{

}
