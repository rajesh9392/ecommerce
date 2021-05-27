package com.demo.shop.dto;

public class CategoryDto {
	
	private int categoryId;
	private String categoryName;
	private String categorydesc;
	public CategoryDto(int categoryId, String categoryName, String categorydesc) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categorydesc = categorydesc;
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
	
	
	

}
