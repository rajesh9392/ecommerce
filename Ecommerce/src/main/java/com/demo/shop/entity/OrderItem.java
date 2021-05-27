package com.demo.shop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class OrderItem{
	@Id
	private int orderItemId;
	private double totalPrice;
	private String createDate;
	
	
	
	public OrderItem(int orderItemId, double totalPrice, String createDate) {
		super();
		this.orderItemId = orderItemId;
		this.totalPrice = totalPrice;
		this.createDate = createDate;
	}

	public OrderItem() {
		
	}
	
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	

	
	
	
	
	
}
