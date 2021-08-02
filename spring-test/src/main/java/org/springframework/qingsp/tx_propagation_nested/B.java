package org.springframework.qingsp.tx_propagation_nested;

import org.springframework.qingsp.tx_exception.BizException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qingshanpeng
 * @date 2021/7/28 11:27
 * @since 标果工厂-脱骨李
 */
@Component
public class B {
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public String print1() throws Exception {
		System.out.println("this is b tx print1...");
		return "1";
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.NESTED, isolation = Isolation.REPEATABLE_READ)
	public String print2() throws Exception {
		System.out.println("this is b tx print2...");
		return "2";
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public String print3() throws Exception {
		System.out.println("this is b tx print3...");
		return "3";
	}

	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public String print4() throws Exception {
		System.out.println("this is b tx print4...");

		throw new Exception("b tx execute failed...");
	}
}
