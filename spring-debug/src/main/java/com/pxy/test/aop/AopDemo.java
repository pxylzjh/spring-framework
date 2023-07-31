package com.pxy.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author puxy
 * @version 1.0
 * @description 测试AOP-within
 * @date 2021/10/26 20:19
 */
@Component
@Aspect
public class AopDemo {

	// TODO 匹配包类型
//	@Pointcut("within(com.pxy.test.aop.service.SomeService)")// 匹配 SomeService 下的所有方法
//	@Pointcut("within(com.pxy.test.aop.service..*)")// com.pxy.test.aop.service 包下所有类及其子包下所有类的方法
	// TODO 匹配对象类型
//	@Pointcut("this(com.pxy.test.aop.service.SomeService)")// 指定目标对象的代理对象的所有方法,即指定 SomeService 的代理对象的方法
//	@Pointcut("target(com.pxy.test.aop.service.SomeService)")// 指定实现SomeService接口的目标对象的方法,如果他有2个实现类,那么两个实现类的方法都会被拦截
//	@Pointcut("bean(*Service)")// 指定所有以Service结尾的对象的方法
	// TODO 匹配参数
//	@Pointcut("args(Long,..)")// 匹配第一个参数为Long类型的方法
	// TODO 匹配注解
// 	@Pointcut("@annotation(com.pxy.test.aop.annotation.Log)")// 所有使用了 @Log注解的方法
//	@Pointcut("@within(com.pxy.test.aop.annotation.Bate)")//匹配所有标注了@Bate注解的类的所有方法,注意 是 类
//	@Pointcut("@target(com.pxy.test.aop.annotation.Bate)")// 匹配所有标注了@Bate注解的类的所有方法,且@Bean的@Retention必须是RUNTIME级别,否则报错
//	@Pointcut("@args(com.pxy.test.aop.annotation.Bate)")// 匹配所有参数标注了@Bate注解的方法
	// TODO execution表达式语法：execution(modifier-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern) throws-pattern)
	//  modifier-pattern 用于匹配public private 等权限修饰符
	//  ret-type-pattern 用于匹配返回值类型,不可省略
	//  declaring-type-pattern 用于匹配包类型
	//  name-pattern(param-pattern) 用于匹配类中的方法和参数,不可省略
	//  throws-pattern 用于匹配抛出异常
	@Pointcut("execution(public String com.pxy.test.aop.service.SomeService.do*(Long))")// 匹配 SomeService中以do开头并且参数为Long类型的public的方法
	public void pointCut01(){}

	// 使用 pointCut01这个切入点进行增强
	@Before("pointCut01()")
	public void before(JoinPoint joinPoint){
		System.out.println("--------before--------");
	}

	@After("pointCut01()")
	public void after(JoinPoint joinPoint){
		System.out.println("--------after--------------");
	}

	@Around("pointCut01()")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("-----------around before----------------");
		Object proceed = pjp.proceed();
		System.out.println("-----------around after----------------");
		return proceed;
	}
}
