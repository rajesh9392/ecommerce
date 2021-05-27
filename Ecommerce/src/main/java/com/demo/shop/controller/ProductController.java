package com.demo.shop.controller;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.shop.common.ApiResponse;
import com.demo.shop.dto.ProductitemDto;
import com.demo.shop.entity.Category;
import com.demo.shop.entity.Productitem;
import com.demo.shop.entity.User;
import com.demo.shop.service.CategoryService;
import com.demo.shop.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/products")
	public Productitem saveUser(@RequestBody  Productitem productitem) {
		return productService.saveProductitem(productitem);
	}
	
//	@GetMapping("/")
//	public ResponseEntity<List<Productitem>> getallEntity(@PathVariable(value = "productName") String productName){
//		List<Productitem> productitems = productService.getAllProductitem(productName);
//		return new ResponseEntity<List<Productitem>>(productitems,HttpStatus.OK);
//	}
	@GetMapping("/{productName}")
	public ResponseEntity<List<ProductitemDto>> getproducts(@RequestParam String productName){
		List<ProductitemDto>listProductitemDtos = productService.listproducts(productName);
		return new ResponseEntity<List<ProductitemDto>>(listProductitemDtos,HttpStatus.OK);
	}
    @PostMapping("/addproduct")
	public ResponseEntity<ApiResponse> addProducts(@RequestBody ProductitemDto productitemDto){
		Optional<Category > optionalcategory = categoryService.readCategory(productitemDto.getCategoryId());
		if(!optionalcategory.isPresent()) {
			return new ResponseEntity<ApiResponse>(new ApiResponse(false, "category in not valid") ,HttpStatus.CONFLICT);
		}
		Category category = optionalcategory.get();
		productService.addproduct(productitemDto,category);
		
		return new ResponseEntity<ApiResponse>(new ApiResponse(true, "product is added") , HttpStatus.CREATED);
	}
   
    
}
