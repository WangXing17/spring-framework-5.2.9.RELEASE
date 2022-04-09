package com.study.springtest;

import org.springframework.beans.factory.FactoryBean;

public class User implements FactoryBean<Car> {
	private int uid;
	private String username;

	public User(int uid, String username) {
		this.uid = uid;
		this.username = username;
	}

	@Override
	public String toString() {
		return "User{" +
				"uid=" + uid +
				", username='" + username + '\'' +
				'}';
	}

	@Override
	public Car getObject() throws Exception {
		return new Car();
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
}
