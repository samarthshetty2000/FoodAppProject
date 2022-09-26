package com.foodapp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.demo.entity.Branch;


@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer> {
	
	

}
