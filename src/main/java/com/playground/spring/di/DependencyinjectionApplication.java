package com.playground.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.playground.spring.di.controllers.ConstructorInjectedController;
import com.playground.spring.di.controllers.DiController;
import com.playground.spring.di.controllers.I18nController;
import com.playground.spring.di.controllers.PropertyInjectedController;
import com.playground.spring.di.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyinjectionApplication.class, args);
		
		DiController diCon = (DiController) context.getBean("diController");
		
		System.out.println(diCon.sayHello());
		
		System.out.println("-------Property Injection-------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.greetings());
		
		System.out.println("-------Setter Injection-------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.greetings());
		
		System.out.println("-------Constructor Injection-------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.greetings());
		
		System.out.println("-------Profile-------");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.greetings());
	}

}
