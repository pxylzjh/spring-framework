package com.pxy.test.aop.service;

import com.pxy.test.TestBean;
import com.pxy.test.aop.annotation.Bate;
import com.pxy.test.aop.annotation.Log;
import com.pxy.test.aop.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author puxy
 * @version 1.0
 * @description 测试AOP-service类
 * @date 2021/10/26 20:39
 */
public interface SomeService {

	void doSomeThing();

	void doLong(Long num);

	void testArgs(Student student);

	String doExecution(Long l);
}
