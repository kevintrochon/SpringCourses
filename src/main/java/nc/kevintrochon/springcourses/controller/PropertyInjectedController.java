package nc.kevintrochon.springcourses.controller;

import nc.kevintrochon.springcourses.services.GreetingService;

public class PropertyInjectedController {
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
