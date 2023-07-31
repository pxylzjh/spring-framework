package com.pxy.test.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author puxy
 * @version 1.0
 * @description TODO
 * @date 2021/10/27 1:02
 */
//@Target(ElementType.TYPE) // 方法注解
@Retention(RetentionPolicy.RUNTIME)
public @interface Bate {
}
