package com.demo.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.shop.common.ApiResponse;
import com.demo.shop.entity.Category;
import com.demo.shop.service.CategoryService;
import com.demo.shop.utills.Helper;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

//	@PostMapping
//	public Category saveCategory(@RequestBody Category category) {
//		return categoryService.savecategory(category);
//	}
	
//	@GetMapping("/{categoryName}")
//	public ResponseEntity<List<Category>> getallEntity(@RequestParam String  categoryName){
//		List<Category> categoryes = categoryService.getAllCategory(categoryName);
//		return new ResponseEntity<List<Category>>(categoryes,HttpStatus.OK);
//	}
	
	@PostMapping("/addcategory")
    @ResponseStatus
	public ResponseEntity<ApiResponse> getEntity(@RequestBody Category category){
		if(Helper.notNull(categoryService.readCategory(category.getCategoryName()))) {
		return new ResponseEntity<ApiResponse>(new ApiResponse(false, "category is invalid"),HttpStatus.CONFLICT);	
		
	}
		categoryService.createCategory(category);
		return new ResponseEntity<ApiResponse>(new ApiResponse(true, "category is valid"),HttpStatus.CREATED);
		
	
	}
}
