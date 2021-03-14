/**
 * 
 */
package com.playground.spring.di.service;

import com.playground.spring.di.repository.EnglishServiceRepository;

/**
 * @author bubaibal
 *
 */
//@Profile("EN")
//@Service("i18nGreetingService")
public class I18nENGreetingService implements GreetingService {

	private final EnglishServiceRepository englishServiceRepository;
	
	/**
	 * @param englishServiceRepository
	 */
	public I18nENGreetingService(EnglishServiceRepository englishServiceRepository) {
		this.englishServiceRepository = englishServiceRepository;
	}

	@Override
	public String greet() {
		
		return englishServiceRepository.getGreeting();
	}

}
