package steps;

import static utilis.Utils.*;
import static utilis.Utils.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks {

	@Before
	public void setUp() throws Exception {
		acessarApp();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
