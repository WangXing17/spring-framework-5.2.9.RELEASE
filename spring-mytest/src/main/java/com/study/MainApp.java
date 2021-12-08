package com.study;

import com.study.springtest.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());
	}
}
