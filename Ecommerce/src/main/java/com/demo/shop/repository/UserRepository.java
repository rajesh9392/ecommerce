package com.demo.shop.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.shop.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByfirstname(String firstname);


}
