package com.pxy.test.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author puxy
 * @version 1.0
 * @description 发布事件,这里为了方便测试,就创建一个bean来调用事件发布方法,事件发布器在spring容器启动时的refresh方法中初始化好了
 * @date 2021/10/25 23:01
 */
@Component
public class TestPublish {
	/**
	 * 事件发布器的创建查看 {@link AbstractApplicationContext#refresh()} 在refresh方法的prepareBeanFactory 方法
	 *
	 * 也可以实现ApplicationEventPublisher接口来获取事件发布器调用发布方法,这里就直接用ac调用了
	 *
	 */
	private final ApplicationContext ac;

	public TestPublish(ApplicationContext ac) {
		this.ac = ac;
	}

	public void testPublish(){
		TestEvent testEvent = new TestEvent(ac,"测试事件");
		ac.publishEvent(testEvent);
		System.out.println("-------发布TestEvent事件-------");
	}

}
