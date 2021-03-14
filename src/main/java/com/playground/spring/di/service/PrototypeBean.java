/**
 * 
 */
package com.playground.spring.di.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author bubaibal
 *
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

	/**
	 * 
	 */
	public PrototypeBean() {
		System.out.println("Prototype Bean Instantiated!!!!");
	}

	public String getBeanType() {
		return "I'm a Prototype Bean";
	}
}
