package com.foodapp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
  User findByEmailAndPassword(String email,String Password);
}
