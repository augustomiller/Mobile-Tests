package steps;

import org.junit.After;
import org.junit.Before;

import pageObject.ClockPage;

public class Hooks {

	ClockPage cp = new ClockPage();

	@Before
	public void acessarApp() throws Exception {
		cp.acessarApp();
	}

	@After
	public void tearDown() {
		cp.tearDown();
	}

}
