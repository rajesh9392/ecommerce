package com.demo.shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.shop.dto.UserDto;
import com.demo.shop.entity.User;
import com.demo.shop.repository.UserRepository;
import com.demo.shop.service.UserService;
@Service
public class UserServiceImpl implements UserService {
 
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public Integer registeruserId(UserDto userDto) {
		User user = new User();
		user.setFirstname(userDto.getFirstname());
		user.setLastname(userDto.getLastname());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setPhoneno(userDto.getPhoneno());
		userRepository.save(user);
		
		return user.getUserId();
	}

//	@Override
//	public List<User> getUserByuserName(String firstname) {
//		// TODO Auto-generated method stub
//		return userRepository.findByfirstname(firstname);
//	}

//	@Override
//	public List<User> getUserByuserName(String firstname) {
//		return userRepository.findByfirstname(firstname);
//	}

	@Override
	public List<User> getProductitemByuserName(String firstname) {
		return userRepository.findByfirstname(firstname);
	}


}
