package com.demo.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.shop.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	public Category findBycategoryName(String categoryName);

}
