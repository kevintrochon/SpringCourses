package nc.kevintrochon.springcourses.controller;

import nc.kevintrochon.springcourses.services.GreetingService;

public class StterInjectedController {
	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayGreeting() {
		return greetingService.sayGreeting();
	}
}
