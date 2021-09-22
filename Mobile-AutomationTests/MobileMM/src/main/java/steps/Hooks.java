package steps;

import static utilis.Utils.acessarApp;
import static utilis.Utils.driver;

import org.junit.After;
import org.junit.Before;

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
