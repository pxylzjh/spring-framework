package com.pxy.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author puxy
 * @version 1.0
 * @description TODO
 * @date 2021/10/21 11:35
 */
public class TestBean {

	@Value("${value:xxx}")
	private String testValue;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "TestBean{" +
				"name='" + name + '\'' +
				", age=" + age +"testValue="+testValue+
				'}';
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;

	private int age;
}
