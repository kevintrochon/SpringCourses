package nc.kevintrochon.springcourses.controller;

import nc.kevintrochon.springcourses.services.GreetingService;

public class ConstructorInjectedController {
	private final GreetingService greetingService;

	/**
	 * @param greetingService
	 */
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayGreeting() {
		return greetingService.sayGreeting();
	}
}
