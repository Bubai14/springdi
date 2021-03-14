/**
 * 
 */
package com.playground.spring.di.repository;

/**
 * @author bubaibal
 *
 */
public class EnglishServiceRepositoryImpl implements EnglishServiceRepository {

	@Override
	public String getGreeting() {
		return "Hello - EN";
	}

}
