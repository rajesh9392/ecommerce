package com.demo.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.shop.entity.OrderItem;

@Repository
public interface OrderRepository extends JpaRepository<OrderItem,Integer>{

}
