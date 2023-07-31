package com.pxy.test.tx;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author puxy
 * @version 1.0
 * @description TODO
 * @date 2021/11/23 12:47
 */
@Service
public class TxService {

	@Transactional
	public void method(){
		System.out.println("do things");
	}

}
