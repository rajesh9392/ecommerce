package com.demo.shop.service;

import java.util.List;


import com.demo.shop.dto.ProductitemDto;
import com.demo.shop.entity.Category;
import com.demo.shop.entity.Productitem;
import com.demo.shop.entity.User;

public interface ProductService {

	public Productitem saveProductitem(Productitem productitem);

//	public List<Productitem> getAllProductitem(String productName);

	public List<ProductitemDto> listproducts(String productName);

	public void addproduct(ProductitemDto productitemDto, Category category);




}
