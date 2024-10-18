package com.hoge.fuga.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.hoge.fuga.domain.User;

@SpringBootTest
@Transactional//テスト後にロールバック
class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	@Test
	void testInsertUser() {
		User user = new User();
		user.setName("konig");
		userMapper.insertUser(user);
	}

	@Test
	void testGetAllUsers() {
		
	}

}
