/**
 * 
 */
package com.playground.spring.di.service;

import org.springframework.stereotype.Service;

/**
 * @author bubaibal
 *
 */
@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String greet() {
		
		return "Hi! there - Constructor";
	}

}
