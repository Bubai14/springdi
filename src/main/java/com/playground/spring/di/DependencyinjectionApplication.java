package com.playground.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.playground.pet.PetController;
import com.playground.spring.di.controllers.ConstructorInjectedController;
import com.playground.spring.di.controllers.DiController;
import com.playground.spring.di.controllers.I18nController;
import com.playground.spring.di.controllers.PropertyInjectedController;
import com.playground.spring.di.controllers.SetterInjectedController;
import com.playground.spring.di.datasource.FakeDataSource;
import com.playground.spring.di.datasource.SpringDataSource;
import com.playground.spring.di.service.PrototypeBean;
import com.playground.spring.di.service.SingletonBean;

@ComponentScan({"com.playground.spring.di","com.playground.pet"})
@EnableConfigurationProperties(SpringDataSource.class)
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
		
		System.out.println("-------Pet-------");
		PetController petController = (PetController) context.getBean("petController");
		System.out.println(petController.whichPetTypeisBest());
		
		
		SingletonBean singletonBean = (SingletonBean) context.getBean(SingletonBean.class);
		System.out.println(singletonBean.getBeanType());
		
		PrototypeBean prototypeBean = (PrototypeBean) context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean.getBeanType());
		
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println("fake datasource - "+fakeDataSource.toString());
		
		SpringDataSource springDataSource = context.getBean(SpringDataSource.class);
		System.out.println("spring datasource - "+springDataSource.toString());
	}

}
