package com.demo.shop.service;

import java.util.List;
import java.util.Optional;

import com.demo.shop.entity.Category;

public interface CategoryService {

	public Category savecategory(Category category);

	public List<Category> getAllCategory(String categoryName);

	public void createCategory(Category category);

	public Optional<Category> readCategory(int categoryId);

	public Object readCategory(String categoryName);
}
