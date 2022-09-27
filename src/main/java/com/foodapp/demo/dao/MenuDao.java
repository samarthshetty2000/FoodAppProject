package com.foodapp.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodapp.demo.Repository.MenuRepository;
import com.foodapp.demo.entity.Menu;

@Component
public class MenuDao {
	
	@Autowired
	MenuRepository menuRepository;
	
	
	public Menu addMenu(Menu menu) {
		return menuRepository.save(menu);
	}
	
	public Menu getMenu(int id) {
		return menuRepository.findById(id).get();
	}

}
