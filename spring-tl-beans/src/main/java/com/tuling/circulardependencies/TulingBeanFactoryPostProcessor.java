package com.tuling.circulardependencies;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * Created by smlz on 2019/7/23.
 */
//@Component
public class TulingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("person");

		genericBeanDefinition.setLazyInit(false);

	}
}
