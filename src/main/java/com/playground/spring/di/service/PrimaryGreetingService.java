/**
 * 
 */
package com.playground.spring.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author bubaibal
 *
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String greet() {
		return "Hi! there - Primary";
	}

}
