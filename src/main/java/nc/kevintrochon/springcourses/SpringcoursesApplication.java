package nc.kevintrochon.springcourses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import nc.kevintrochon.springcourses.controller.ConstructorInjectedController;
import nc.kevintrochon.springcourses.controller.MyController;
import nc.kevintrochon.springcourses.controller.PropertyInjectedController;
import nc.kevintrochon.springcourses.controller.StterInjectedController;

@SpringBootApplication
public class SpringcoursesApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx = SpringApplication.run(SpringcoursesApplication.class, args);
	  MyController myController = (MyController) ctx.getBean("myController");
	  String greeting = myController.sayHello();
	  System.out.println(greeting);
	  
	  System.out.println("--------Property------");
	  
	  PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
	  System.out.println(propertyInjectedController.getGreeting());
	  
	  System.out.println("--------Setter------");
	  StterInjectedController stterInjectedController = (StterInjectedController) ctx.getBean("stterInjectedController");
	  System.out.println(stterInjectedController.getGreeting());
	  
	  System.out.println("--------Constructor------");
	  ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
	  System.out.println(constructorInjectedController.getGreeting());
	}

}
