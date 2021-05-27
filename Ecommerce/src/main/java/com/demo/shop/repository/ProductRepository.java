package com.demo.shop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.shop.entity.Productitem;

public interface ProductRepository  extends JpaRepository<Productitem, Integer>{

	

}
