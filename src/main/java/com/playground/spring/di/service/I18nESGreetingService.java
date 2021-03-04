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
@Profile({"ES", "default"})
@Service("i18nGreetingService")
public class I18nESGreetingService implements GreetingService {

	@Override
	public String greet() {
		
		return "Hola - ES";
	}

}
