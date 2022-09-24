package nc.kevintrochon.springcourses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import nc.kevintrochon.springcourses.controller.MyController;

@SpringBootApplication
public class SpringcoursesApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx = SpringApplication.run(SpringcoursesApplication.class, args);
	  MyController myController = (MyController) ctx.getBean("myController");
	  String greeting = myController.sayHello();
	  System.out.println(greeting);
	}

}
