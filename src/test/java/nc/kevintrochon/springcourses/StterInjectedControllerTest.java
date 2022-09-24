/**
 * 
 */
package nc.kevintrochon.springcourses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nc.kevintrochon.springcourses.controller.StterInjectedController;
import nc.kevintrochon.springcourses.services.GreetingService;
import nc.kevintrochon.springcourses.services.ConstructorGreetingService;

/**
 * @author Utilisateur
 *
 */
class StterInjectedControllerTest {

	public StterInjectedController controller;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new StterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void test() {
		System.out.println(controller.sayGreeting());
	}

}
