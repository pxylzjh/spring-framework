package com.pxy.test.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author puxy
 * @version 1.0
 * @description 事件, 必须调用父类的构造方法
 * @date 2021/10/25 22:35
 */
public class TestEvent extends ApplicationEvent {
	private String message;
	// 用Gradle构建项目时,如果不加 serialVersionUID会报错
	private static final long serialVersionUID = 11111111111L;
	/**
	 * Create a new ContextStartedEvent.
	 *
	 * @param source the {@code ApplicationContext} that the event is raised for
	 *               (must not be {@code null})
	 */
	// 调用父类的构造方法
	public TestEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
