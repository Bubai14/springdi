/**
 * 
 */
package com.playground.spring.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.playground.spring.di.repository.EnglishServiceRepository;
import com.playground.spring.di.repository.EnglishServiceRepositoryImpl;
import com.playground.spring.di.service.ConstructorGreetingService;
import com.playground.spring.di.service.I18nENGreetingService;
import com.playground.spring.di.service.I18nESGreetingService;
import com.playground.spring.di.service.PrimaryGreetingService;
import com.playground.spring.di.service.PropertyGreetingService;
import com.playground.spring.di.service.SetterGreetingService;

/**
 * @author bubaibal
 *
 */
@Configuration
public class GreetingServiceConfig {

	@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}
	
	@Bean
	PropertyGreetingService propertyGreetingService() {
		return new PropertyGreetingService();
	}
	
	@Bean
	SetterGreetingService setterGreetingService() {
		return new SetterGreetingService();
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	@Bean
	EnglishServiceRepository englishServiceRepository() {
		return new EnglishServiceRepositoryImpl();
	}
	
	
	@Profile("EN")
	@Bean
	I18nENGreetingService i18nGreetingService(EnglishServiceRepository englishServiceRepository) {
		return new I18nENGreetingService(englishServiceRepository);
	}
	
	@Profile({"ES", "default"})
	@Bean("i18nGreetingService")
	I18nESGreetingService i18nESGreetingService() {
		return new I18nESGreetingService();
	}
}
