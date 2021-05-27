package com.demo.shop.dto;

import com.demo.shop.entity.Productitem;

public class ProductitemDto {

	private String ProductName;
    private String productdesc;
	private double price;
	private int quatity;
	private int categoryId;
	
	public ProductitemDto(Productitem productitem) {
		this.setProductName(productitem.getProductName());
		this.setProductdesc(productitem.getProductdesc());
		this.setPrice(productitem.getPrice());
		this.setQuatity(productitem.getQuatity());
		this.setCategoryId(productitem.getCategory().getCategoryId());
	}
	

	public ProductitemDto(String productName, String productdesc, double price, int quatity, int categoryId) {
		super();
		ProductName = productName;
		this.productdesc = productdesc;
		this.price = price;
		this.quatity = quatity;
		this.categoryId = categoryId;
	}

	public ProductitemDto(){
		
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	
	
}
