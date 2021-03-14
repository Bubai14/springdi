/**
 * 
 */
package com.playground.spring.di.service;

/**
 * @author bubaibal
 *
 */
//@Profile({"ES", "default"})
//@Service("i18nGreetingService")
public class I18nESGreetingService implements GreetingService {

	@Override
	public String greet() {
		
		return "Hola - ES";
	}

}
