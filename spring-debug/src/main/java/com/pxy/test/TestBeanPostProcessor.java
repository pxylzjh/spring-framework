package com.pxy.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author puxy
 * @version 1.0
 * @description 测试 BeanPostProcessor
 * @date 2021/10/25 20:56
 */
//@Component
public class TestBeanPostProcessor implements BeanPostProcessor {

	private String name;

	private int age;

	@Bean
	public void test() {
		System.out.println("---------@Bean方法---------");
	}

	//Bean实例化之前执行
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("---------执行了 postProcessBeforeInitialization 方法-----------");
		if (bean instanceof TestBeanPostProcessor) {
			((TestBeanPostProcessor) bean).setAge(1);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("---------执行了 postProcessAfterInitialization 方法-----------");
		if (bean instanceof TestBeanPostProcessor) {
			((TestBeanPostProcessor) bean).setName("xxx");
		}
		return bean;
	}

	public String getName() {
		return name;
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
}
