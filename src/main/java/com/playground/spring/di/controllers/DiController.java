/**
 * 
 */
package com.playground.spring.di.controllers;

import org.springframework.stereotype.Controller;

import com.playground.spring.di.service.GreetingService;

/**
 * @author bubaibal
 *
 */
@Controller
public class DiController {
	
	private final GreetingService greetingService;
	
	/**
	 * @param greetingService
	 */
	public DiController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}



	public String sayHello() {
		
		return greetingService.greet();
	}

}
