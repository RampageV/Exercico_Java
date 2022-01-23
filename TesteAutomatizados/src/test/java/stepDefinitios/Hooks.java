package stepDefinitios;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import teste.Calculadora;
import static utils.Utils2.*;

public class Hooks {

	@Before
	public void setUp() throws Exception {
		AcessarKeep();
	}

	@After
	public void fecharCalculadora() throws Exception {
		driver.quit();
	}

}
