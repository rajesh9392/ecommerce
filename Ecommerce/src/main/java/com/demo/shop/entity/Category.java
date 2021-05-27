package com.demo.shop.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "category")
public class Category {
	@Id
	private int categoryId;
	private String categoryName;
	private String categorydesc;

	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
	@JsonIgnore
	Set<Productitem> productitem;

	public Category() {
	}
	
	public Category(@JsonProperty("categoryName")String categoryName, @JsonProperty("categorydesc")String categorydesc) {
		this.categoryName = categoryName;
		this.categorydesc = categorydesc;
	}


	public Category(int categoryId, String categoryName, String categorydesc, Set<Productitem> productitem) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categorydesc = categorydesc;
		this.productitem = productitem;
	}

	public Set<Productitem> getProductitem() {
		return productitem;
	}

	public void setProductitem(Set<Productitem> productitem) {
		this.productitem = productitem;
	}

	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategorydesc() {
		return categorydesc;
	}
	public void setCategorydesc(String categorydesc) {
		this.categorydesc = categorydesc;
	}

	
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categorydesc="
				+ categorydesc + "]";
	}

	

	
	
	
	

}
