package com.study.springtest;

public class User {
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
}
