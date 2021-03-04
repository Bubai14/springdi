/**
 * 
 */
package com.playground.spring.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author bubaibal
 *
 */
@Profile("EN")
@Service("i18nGreetingService")
public class I18nENGreetingService implements GreetingService {

	@Override
	public String greet() {
		
		return "Hello - EN";
	}

}
