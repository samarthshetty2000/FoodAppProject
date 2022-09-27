package com.foodapp.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodapp.demo.Repository.ItemRepository;
import com.foodapp.demo.entity.Item;

@Component
public class ItemDao {
	
	@Autowired
	ItemRepository itemRepository;
	
	public Item addItem(Item item) {
		return itemRepository.save(item);
	}
	
	public List<Item> getAllItems(){
		return itemRepository.findAll();
		
	}
	
	public Item getItemById(int id) {
		Optional<Item> optional=itemRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
		
	}

}
