package com.pxy.test;

import com.pxy.test01.TestPojo;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author puxy
 * @version 1.0
 * @description TODO
 * @date 2021/10/21 11:36
 */
class TestBeanTest {

	@Test
	public void test01(){
//		AnnotationConfigApplicationContext ac1 = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext ac = new ClassPathXmlApplicationContext("Application-Debug.xml");

		NotSingleton notSingleton = ac.getBean(NotSingleton.class);
		NotSingleton notSingleton2 = ac.getBean(NotSingleton.class);
		System.out.println(notSingleton2==notSingleton);

		TestBean bean = (TestBean) ac.getBean("testBean");
		TestPojo bean1 = ac.getBean(TestPojo.class);
		int beanDefinitionCount = ac.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);
		System.out.println(bean);
	}

}