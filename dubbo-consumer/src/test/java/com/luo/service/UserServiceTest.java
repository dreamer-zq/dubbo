package com.luo.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.UserService;

public class UserServiceTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService.findById(2));
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
