/**
 * 
 */
package nc.kevintrochon.springcourses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nc.kevintrochon.springcourses.controller.ConstructorInjectedController;
import nc.kevintrochon.springcourses.services.ConstructorGreetingService;

/**
 * @author Utilisateur
 *
 */
class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
		
	}

	/**
	 * Test method for {@link nc.kevintrochon.springcourses.controller.ConstructorInjectedController#ConstructorInjectedController(nc.kevintrochon.springcourses.services.GreetingService)}.
	 */
	@Test
	void testConstructorInjectedController() {
		System.out.println(controller.sayGreeting());
	}

}
