/**
 * 
 */
package com.playground.spring.di.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author bubaibal
 *
 */
@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	
	/**
	 * 
	 */
	public LifeCycleDemoBean() {
		System.out.println("I am in LifeCycleDemoBean Constructor.");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## Application Context has been set.");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## Bean Factory has been set.");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## Bean name "+name+" has been set.");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## Destroying the bean.");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## LifeCycleDemoBean has its properties set.");

	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("## PostConstruct has been called.");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("## PreDestroy has been called.");
	}

	public void beforeInit() {
		System.out.println("## Before init has been called from CustomBeanPostProcessor.");
	}
	
	public void afterInit() {
		System.out.println("## After init has been called from CustomBeanPostProcessor.");
	}
}
