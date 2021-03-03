/**
 * 
 */
package com.playground.spring.di.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author bubaibal
 *
 */
@Controller
public class DiController {
	
	public String sayHello() {
		
		System.out.println("Hello World!");
		
		return "Hi! folks";
	}

}
