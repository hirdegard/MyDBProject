package com.hoge.fuga.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.hoge.fuga.domain.User;
import com.hoge.fuga.mapper.UserMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	private final UserMapper userMapper;
	
	
	public void createUser (String name) {
		User user = new User();
		user.setName(name);
		userMapper.insertUser(user);
	}
	
	public List<User> getAllUsers () {
		return userMapper.getAllUsers();
	}
}
