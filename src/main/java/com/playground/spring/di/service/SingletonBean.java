/**
 * 
 */
package com.playground.spring.di.service;

import org.springframework.stereotype.Component;

/**
 * @author bubaibal
 *
 */
@Component
public class SingletonBean {

	/**
	 * 
	 */
	public SingletonBean() {
		System.out.println("Singleton bean initiated!!!!");
	}

	public String getBeanType() {
		return "I' m a Singleton Bean!!!";
	}
	
}
