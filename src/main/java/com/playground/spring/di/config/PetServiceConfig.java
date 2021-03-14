/**
 * 
 */
package com.playground.spring.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.playground.pet.PetService;
import com.playground.pet.PetServiceFactory;

/**
 * @author bubaibal
 *
 */
@Configuration
public class PetServiceConfig {
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile({"dog", "default"})
	@Bean("petService")
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Profile("cat")
	@Bean("petService")
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}

}
