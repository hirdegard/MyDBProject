package com.hoge.fuga.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hoge.fuga.domain.User;

@Mapper
public interface UserMapper {

	void insertUser(User user);
	
	List<User> getAllUsers ();
}
