package com.pxy.test01;

import com.pxy.test.A;
import com.pxy.test.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author puxy
 * @version 1.0
 * @description TODO
 * @date 2021/10/21 11:36
 */
@Component
public class TestPojo {


	private Pojo4Set pojo4Set;

	private final TestBean testBean;

	// 采用构造方法的方式 注入
	public TestPojo(TestBean testBean) {
		this.testBean = testBean;
	}

	public void setPojo4Set(Pojo4Set pojo4Set) {
		this.pojo4Set = pojo4Set;
	}

	@Bean
	public A initA() {
		return new A("xx");
	}
}
