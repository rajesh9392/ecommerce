package com.demo.shop.service;

import java.util.List;

import com.demo.shop.dto.UserDto;
import com.demo.shop.entity.User;

public interface UserService {

	public User saveUser(User user);
	
	public Integer registeruserId(UserDto userDto);

	public List<User> getProductitemByuserName(String firstname);

//	public List<User> getUserByuserName(String firstname);

}
