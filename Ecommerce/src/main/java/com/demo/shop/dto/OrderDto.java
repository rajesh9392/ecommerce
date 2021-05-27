package com.demo.shop.dto;

public class OrderDto {
	
	private int orderItemId;
	private double totalPrice;
	private String createDate;
	
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
	@Override
	public String toString() {
		return "OrderDto [orderItemId=" + orderItemId + ", totalPrice=" + totalPrice + ", createDate=" + createDate
				+ "]";
	}
	
	

}
