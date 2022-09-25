package nc.kevintrochon.springcourses.controller;

import org.springframework.stereotype.Controller;

import nc.kevintrochon.springcourses.services.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	/**
	 * @param greetingService
	 */
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}



	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
