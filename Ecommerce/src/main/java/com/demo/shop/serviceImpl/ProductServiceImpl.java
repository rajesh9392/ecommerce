package com.demo.shop.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.shop.dto.ProductitemDto;
import com.demo.shop.entity.Category;
import com.demo.shop.entity.Productitem;
import com.demo.shop.repository.ProductRepository;
import com.demo.shop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Productitem saveProductitem(Productitem productitem) {
		return productRepository.saveAndFlush(productitem);
	}

//	@Override
//	public List<Productitem> getAllProductitem(String productName) {
//		return productRepository.findAll();
//	}

	@Override
	public List<ProductitemDto> listproducts(String productName) {
		List<Productitem> productitems = productRepository.findAll();
		List<ProductitemDto> productitemDtos = new ArrayList<>();
		for(Productitem productitem : productitems) {
			ProductitemDto productitemDto = getDtoformProductitem(productitem);
			productitemDtos.add(productitemDto);
		}
		return productitemDtos;
	}

	public  static ProductitemDto getDtoformProductitem(Productitem productitem) {
		ProductitemDto productitemDto = new ProductitemDto(productitem);
		return productitemDto;
	}
	public static Productitem getpProductitemformDto(ProductitemDto productitemDto ,Category category) {
		Productitem productitem = new Productitem(productitemDto,category);
		return  productitem;
	}
	

	@Override
	public void addproduct(ProductitemDto productitemDto, Category category) {
		Productitem productitem = new Productitem(productitemDto,category);
		productRepository.save(productitem);
		
	}



}
