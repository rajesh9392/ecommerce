package com.demo.shop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.shop.entity.OrderItem;
import com.demo.shop.repository.OrderRepository;
import com.demo.shop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderRepository orderRepository;

	@Override
	public OrderItem saveOrder(OrderItem order) {
		return orderRepository.save(order);
	}

	
	
	
}
