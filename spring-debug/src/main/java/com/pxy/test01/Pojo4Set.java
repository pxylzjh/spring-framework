package com.pxy.test01;

import org.springframework.stereotype.Component;

/**
 * @author puxy
 * @version 1.0
 * @description 用来测试set方法注入的
 * @date 2021/11/21 0:14
 */
@Component
public class Pojo4Set {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
