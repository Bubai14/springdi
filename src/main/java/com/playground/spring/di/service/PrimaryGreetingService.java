/**
 * 
 */
package com.playground.spring.di.service;

/**
 * @author bubaibal
 *
 */
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String greet() {
		return "Hi! there - Primary";
	}

}
