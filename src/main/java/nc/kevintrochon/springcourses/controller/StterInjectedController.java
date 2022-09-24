package nc.kevintrochon.springcourses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import nc.kevintrochon.springcourses.services.GreetingService;
@Controller
public class StterInjectedController {
	private GreetingService greetingService;
	
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
