package com.pxy.test;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author puxy
 * @version 1.0
 * @description 测试非单例
 * @date 2021/11/18 11:08
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(WebApplicationContext.SCOPE_REQUEST)
public class NotSingleton {


	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
