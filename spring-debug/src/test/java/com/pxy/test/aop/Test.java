package com.pxy.test.aop;

import com.pxy.test.aop.entity.Student;
import com.pxy.test.aop.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author puxy
 * @version 1.0
 * @description TODO
 * @date 2021/10/26 20:49
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Application-Debug.xml");
		SomeService service = ac.getBean(SomeService.class);
		service.doSomeThing();
		service.doLong(1L);
		service.testArgs(new Student());
		service.doExecution(1231L);
	}

}
