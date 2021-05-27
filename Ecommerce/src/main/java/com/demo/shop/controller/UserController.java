package com.demo.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.shop.dto.UserDto;
import com.demo.shop.entity.User;
import com.demo.shop.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/userDetails")
	public User saveUser(@RequestBody  User user) {
		return userService.saveUser(user);
	}
	
	@PostMapping("/me")
	public ResponseEntity<String> regiEntity(@RequestBody UserDto userDto){
		Integer userId = userService.registeruserId(userDto);
		return new ResponseEntity<>("user is apply"+userId, HttpStatus.OK);
	
		
	}
	
	@GetMapping("/row1")
	   public List<User> firstnameandlastname (@RequestParam String firstname){
		return userService.getProductitemByuserName(firstname);
	}
}
