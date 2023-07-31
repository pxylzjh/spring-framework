package com.pxy.test.event;

import com.pxy.test.TestBean;
import com.pxy.test01.TestPojo;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author puxy
 * @version 1.0
 * @description 测试事件
 * @date 2021/10/26 0:39
 */
class TestEventTest {
	@Test
	public void test01(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("Application-Debug.xml");
		TestPublish testPublish = (TestPublish)ac.getBean("testPublish");
		testPublish.testPublish();
	}
}