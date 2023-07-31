package com.pxy.test.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author puxy
 * @version 1.0
 * @description 测试循环依赖的bean
 * @date 2021/10/26 14:32
 */
@Component
public class CycleBean02 {

	@Autowired
	private CycleBean01 bean01;

}
