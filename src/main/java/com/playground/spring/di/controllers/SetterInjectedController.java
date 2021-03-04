/**
 * 
 */
package com.playground.spring.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.playground.spring.di.service.GreetingService;

/**
 * @author bubaibal
 *
 */
@Controller
public class SetterInjectedController {

	private GreetingService greetingService;

	/**
	 * @param greetingService the greetingService to set
	 */
	@Autowired
	@Qualifier("setterGreetingService") 
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String greetings() {
		return greetingService.greet();
	}
	
}
