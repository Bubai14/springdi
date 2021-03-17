/**
 * 
 */
package com.playground.spring.di.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.playground.spring.di.datasource.FakeDataSource;
import com.playground.spring.di.datasource.SpringDataSource;

/**
 * @author bubaibal
 *
 */
@PropertySource("classpath:datasource.properties")
@Configuration
public class DataSourceConfig {

	@Bean
	FakeDataSource fakeDataSource(@Value("${guru.username}")String username, 
			@Value("${guru.password}")String password, 
			@Value("${guru.jdbcurl}")String jdbcUrl) {
		
		return new FakeDataSource(username, password, jdbcUrl);
	}
	
	@Bean
	SpringDataSource springDataSource(@Value("${spring.username}")String username, 
			@Value("${spring.password}")String password, 
			@Value("${spring.jdbcurl}")String jdbcUrl) {
		
		return new SpringDataSource(username, password, jdbcUrl);
		
	}
}
