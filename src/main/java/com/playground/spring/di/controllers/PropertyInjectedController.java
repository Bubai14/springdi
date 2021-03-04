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
public class PropertyInjectedController {

	@Autowired
	@Qualifier("propertyGreetingService") 
	private GreetingService greetingService;
	
	public String greetings() {
		return greetingService.greet();
	}
	
}
