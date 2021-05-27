package com.demo.shop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.demo.shop.dto.ProductitemDto;

@Entity
@Table(name = "product_item")
public class Productitem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_Id")
	private int productId;
	@Column(name = "product_Name")
	private String ProductName;
	@Column(name="productdesc")
    private String productdesc;
	private double price;
	private int quatity;
	
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;
	
	public Productitem(ProductitemDto productitemDto,Category category) {
		this.ProductName = productitemDto.getProductName();
		this.productdesc = productitemDto.getProductdesc();
		this.price = productitemDto.getPrice();
		this.quatity = productitemDto.getQuatity();
		this.category = category;
	}
	
	public Productitem() {
		
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Productitem [productId=" + productId + ", ProductName=" + ProductName + ", productdesc=" + productdesc
				+ ", price=" + price + ", quatity=" + quatity + "]";
	}

	




	
	

}
