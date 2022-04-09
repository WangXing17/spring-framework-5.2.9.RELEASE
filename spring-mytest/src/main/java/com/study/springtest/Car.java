package com.study.springtest;

/**
 * @author xingwang
 * @date 2022/3/14 17:38
 * @description
 */
public class Car {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				'}';
	}
}
