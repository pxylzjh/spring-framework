package com.pxy.test.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author puxy
 * @version 1.0
 * @description 监听器：监听并执行事件
 * @date 2021/10/25 22:59
 */
@Component
public class TestListener implements ApplicationListener<TestEvent> {

	@Override
	public void onApplicationEvent(TestEvent event) {
		String message = event.getMessage();
		System.out.println("---------监听到事件执行onApplicationEvent----------");
	}
}
