/**
 * 
 */
package nc.kevintrochon.springcourses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nc.kevintrochon.springcourses.controller.PropertyInjectedController;
import nc.kevintrochon.springcourses.services.ConstructorGreetingService;

/**
 * @author Utilisateur
 *
 */
class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorGreetingService();
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
