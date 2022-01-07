package com.arvin.mapleforestbackend;

import com.arvin.mapleforestbackend.POJO.User;
import com.arvin.mapleforestbackend.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MapleForestBackendApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void test01(){
		final List<User> users = userMapper.selectAll();
		System.out.println(users);
	}

}
