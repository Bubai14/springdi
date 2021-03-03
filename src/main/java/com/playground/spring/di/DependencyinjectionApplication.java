package com.playground.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.playground.spring.di.controllers.DiController;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyinjectionApplication.class, args);
		
		DiController diCon = (DiController) context.getBean("diController");
		
		System.out.println(diCon.sayHello());
	}

}
