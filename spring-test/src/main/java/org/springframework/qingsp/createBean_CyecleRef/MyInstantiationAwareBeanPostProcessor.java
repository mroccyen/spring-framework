package org.springframework.qingsp.createBean_CyecleRef;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author qingsp
 * @date 2021/5/26 14:18
 * @since 标果工厂-玫瑰香
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		int i = 0;
		int j = 0;
		int k = 0;
		return bean;
	}
}
