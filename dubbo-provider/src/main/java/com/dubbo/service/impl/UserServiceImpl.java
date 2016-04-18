package com.dubbo.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.model.User;
import com.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private static Map<Integer, User> db = new HashMap<Integer, User>();

	static {
		db.put(1, new User(1, "zhangsan1", "111111", 20));
		db.put(2, new User(2, "zhangsan2", "111111", 20));
		db.put(3, new User(3, "zhangsan3", "111111", 20));
		db.put(4, new User(4, "zhangsan4", "111111", 20));
		db.put(5, new User(5, "zhangsan5", "111111", 20));
	}

	public User findById(int id) {
		return db.get(id);
	}

}
