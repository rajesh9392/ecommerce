package com.demo.shop.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.shop.entity.Category;
import com.demo.shop.repository.CategoryRepository;
import com.demo.shop.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category savecategory(Category category) {
		return categoryRepository.saveAndFlush(category);
	}

	@Override
	public List<Category> getAllCategory(String categoryName) {
		
		return categoryRepository.findAll();
	}
	@Override
	public Optional<Category> readCategory(int categoryId) {
		
		return categoryRepository.findById(categoryId);
	}
	@Override
	public Category readCategory(String categoryName) {
		return categoryRepository.findBycategoryName(categoryName);
	}
	@Override
	public void createCategory(Category category) {
		categoryRepository.save(category);
		
	}
		
}
