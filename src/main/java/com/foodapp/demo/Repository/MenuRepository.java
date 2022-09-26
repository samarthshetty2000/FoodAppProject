package com.foodapp.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.demo.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {

}
