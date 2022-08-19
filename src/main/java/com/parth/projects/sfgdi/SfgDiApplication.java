package com.parth.projects.sfgdi;

import com.parth.projects.sfgdi.controller.ConstructorInjectedController;
import com.parth.projects.sfgdi.controller.MyController;
import com.parth.projects.sfgdi.controller.PropertyInjectedController;
import com.parth.projects.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);
		// Here we are asking the context to give us the object of the MyController class
		// which it has created because we have annotated it with @Controller
		MyController myController = (MyController) applicationContext.getBean("myController");
		String greeting  = myController.greet();
		System.out.println("MAIN: "+ greeting);
		System.out.println("PROPERTY ------");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("SETTER ------");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("CONSTRUCTOR ------");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
