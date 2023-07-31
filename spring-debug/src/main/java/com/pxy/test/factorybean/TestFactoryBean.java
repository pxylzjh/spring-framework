package com.pxy.test.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author puxy
 * @version 1.0
 * @description 测试FactoryBean
 * @date 2021/11/3 16:03
 */
@Component
public class TestFactoryBean implements FactoryBean<Object> {
	/**
	 * FactoryBean 是一个接口,里面有3个方法
	 * 它相当于一个bean的工厂
	 * getObject获取bean对象,注意：我们可以返回任意对象
	 * getObjectType获取bean的class
	 * isSingleton指定bean是否是单例
	 */
	@Override
	public Object getObject() throws Exception {
		Cat cat = new Cat();

		return cat;
	}

	@Override
	public Class<?> getObjectType() {
		return Cat.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
