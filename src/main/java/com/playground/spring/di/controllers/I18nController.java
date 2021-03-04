/**
 * 
 */
package com.playground.spring.di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.playground.spring.di.service.GreetingService;

/**
 * @author bubaibal
 *
 */
@Controller
public class I18nController {

	private final GreetingService greetingService;

	/**
	 * @param greetingService
	 */
	public I18nController(@Qualifier("i18nGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String greetings() {
		return greetingService.greet();
	}
}
