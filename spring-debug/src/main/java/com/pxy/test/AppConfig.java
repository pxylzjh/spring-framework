package com.pxy.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author puxy
 * @version 1.0
 * @description TODO
 * @date 2021/10/22 2:35
 */
@Configuration
@ComponentScan("com.pxy.test01")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class AppConfig {
}
