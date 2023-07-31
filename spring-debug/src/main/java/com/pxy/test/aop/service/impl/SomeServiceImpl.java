package com.pxy.test.aop.service.impl;

import com.pxy.test.TestBean;
import com.pxy.test.aop.annotation.Bate;
import com.pxy.test.aop.annotation.Log;
import com.pxy.test.aop.entity.Student;
import com.pxy.test.aop.service.SomeService;
import com.pxy.test01.TestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author puxy
 * @version 1.0
 * @description 测试AOP-service类
 * @date 2021/10/26 20:39
 */
@Service
@Bate
public class SomeServiceImpl implements SomeService {

	@Autowired
	private TestBean testBean;

	private TestPojo pojo;

	//set注入
	@Transactional
	public void setPojo(TestPojo pojo) {
		this.pojo = pojo;
	}

	@Log
	@Override
	public void doSomeThing() {
		System.out.println("---------doSomeThing----------");
	}

	@Override
	public void doLong(Long num) {
		System.out.println("-------------do long--------------");
	}

	@Override
	public void testArgs(Student student) {
		System.out.println("--------@args--------");
	}

	@Override
	public String doExecution(Long l) {
		System.out.println("-------execution-------");
		return "" + l;
	}
}
